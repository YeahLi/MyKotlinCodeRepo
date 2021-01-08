package com.henry.oop

interface InputDevice{
    fun input(event: Any)
}

interface USBInputDevice: InputDevice
interface BLEInputDevice: InputDevice

interface OpticalMouse

abstract class USBMouse(val name:String): USBInputDevice, OpticalMouse{
    override fun input(event: Any) {
        if (event is String){
            when(event){
                "right_click" -> println("clicked right button")
                "left_click" -> println("clicked left button")
                else -> {

                }
            }
        }
    }

    override fun toString(): String {
        return name;
    }
}

class LogitechMouse:USBMouse("罗技鼠标")

class Computer{
    private fun addUSBInputDevice(inputDevice:USBInputDevice){
        println("Add usb input device $inputDevice")
    }

    private fun addBLEInputDevice(inputDevice:BLEInputDevice){
        println("Add bluetooth input device $inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice){
        when(inputDevice){
            is USBInputDevice -> {
                addUSBInputDevice(inputDevice)
            }
            is BLEInputDevice -> {
                addBLEInputDevice(inputDevice)
            }
            else -> {
                throw IllegalArgumentException("输入设备类型不支持")
            }
        }
    }
}

fun main() {
    val computer = Computer()
    val mouse = LogitechMouse()
    computer.addInputDevice(mouse)
}