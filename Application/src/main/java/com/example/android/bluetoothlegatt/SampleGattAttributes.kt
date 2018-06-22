/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt

import java.util.HashMap

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
object SampleGattAttributes {
    var attributes: HashMap<String, String> = HashMap()
    var HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb"
    var CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb"

    init {
        // Sample Services.
        attributes.put ("00001800-0000-1000-8000-00805f9b34fb", "Generic Access")
        attributes.put ("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute")
        attributes.put ("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service")

        attributes.put ("00002800-0000-1000-8000-00805f9b34fb", "Primary Service")
        attributes.put ("00002801-0000-1000-8000-00805f9b34fb", "Secondary Service")
        attributes.put ("00002802-0000-1000-8000-00805f9b34fb", "Include Service")
        attributes.put ("00002803-0000-1000-8000-00805f9b34fb", "Characteristic Declaration")

        attributes.put ("00002901-0000-1000-8000-00805f9b34fb", "Characteristic User Description")
        attributes.put ("00002902-0000-1000-8000-00805f9b34fb", "Client Characteristic Configuration")
        attributes.put ("00002904-0000-1000-8000-00805f9b34fb", "Characteristic Presentation Format")

        attributes.put ("00002a00-0000-1000-8000-00805f9b34fb", "Device Name")
        attributes.put ("00002a01-0000-1000-8000-00805f9b34fb", "Appearance")
        attributes.put ("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed")
        attributes.put ("00002a19-0000-1000-8000-00805f9b34fb", "Battery Level")
        attributes.put ("00002a1a-0000-1000-8000-00805f9b34fb", "Battery Power State")
        attributes.put ("00002a24-0000-1000-8000-00805f9b34fb", "Model Number")
        attributes.put ("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number")
        attributes.put ("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Version")
        attributes.put ("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Version")
        attributes.put ("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name")
        attributes.put ("00002a6e-0000-1000-8000-00805f9b34fb", "Temperature")
        attributes.put ("00002a6f-0000-1000-8000-00805f9b34fb", "Humidity")
        attributes.put ("00002a7a-0000-1000-8000-00805f9b34fb", "Head Index")
        attributes.put ("00002aa6-0000-1000-8000-00805f9b34fb", "Central Address Resolution")

        attributes.put ("00002700-0000-1000-8000-00805f9b34fb", "Unitless")
        attributes.put ("00002703-0000-1000-8000-00805f9b34fb", "Time (Second)")
        attributes.put ("00002728-0000-1000-8000-00805f9b34fb", "Volt")
        attributes.put ("0000272f-0000-1000-8000-00805f9b34fb", "Celcius")
        attributes.put ("00002787-0000-1000-8000-00805f9b34fb", "Bel")
        attributes.put ("000027ad-0000-1000-8000-00805f9b34fb", "Percentage")

        attributes.put ("05f09533-7993-4727-aa71-5d2e27c405aa", "DogSafe Service")
        attributes.put ("505b81b5-1fe2-4235-983e-53fa7a253054", "Role")
        attributes.put ("57d34aa6-4aae-412b-8840-e50bdf9523b4", "Battery Voltage")
        attributes.put ("c9f785f9-70b2-4381-bba8-ba5bedb2672d", "RSSI")
        attributes.put ("dd3a6006-2586-4ed4-8d58-4405b90281f4", "SNR")
        attributes.put ("e72a4def-0deb-45a3-a6a9-b845852b4761", "Last Heard")
        attributes.put ("30987815-dc21-440f-a95e-f994f87d41da", "Packet Number")
        attributes.put ("27766c23-419c-45c4-a8ea-79c1e9d89f63", "High Temperature Alarm")
        attributes.put ("cffacad7-8bf9-4ff9-a033-d5aea342c444", "Low Temperature Alarm")
        attributes.put ("47e20c8e-8eb0-40c0-8245-be96603f9743", "High Humidity Alarm")
        attributes.put ("4cf0aa26-b2f5-4a92-8905-8b585d97d84e", "Low Humidity Alarm")
        attributes.put ("50c834c9-9b9c-4554-b1ac-1123dded3519", "Channel Number")
    }


    fun lookup(uuid: String, defaultName: String): String {
        val name = attributes.get(uuid)
        return name ?: defaultName
    }
}
