package main

/**
 * Created by HP
 * Created by 2019/4/16 21:57
 */
interface inputDevice {
    fun input(add: Any)
}

interface USBinputDevice : inputDevice

interface BLEinputDevice : inputDevice

class Computer {

    fun usbInputDevice(usBinputDevice: USBinputDevice) {
        println("add usb inputDevice")
    }

    fun bleInputDevice(blEinputDevice: BLEinputDevice) {
        println("add ble inputDevice")
    }

    fun inputDevice(inputDevice: inputDevice) {
        println("add inputDevice")

        when(inputDevice){
            is BLEinputDevice ->bleInputDevice(inputDevice)
            is USBinputDevice ->usbInputDevice(inputDevice)
            else->throw IllegalArgumentException("输入设备不支持")
        }
    }

}

class USBMouse(val name: String): USBinputDevice {
    override fun input(add: Any) {
        println(name)
    }

    override fun toString(): String {
        println(name)
        return name
    }

}

fun main(args: Array<String>) {
    val computer = Computer()
    val usbMouse = USBMouse("惠普笔记本")
    computer.inputDevice(usbMouse)
}