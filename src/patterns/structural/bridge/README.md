## Bridge

### How I understand
The abstraction (Device class with method chargeOn() and two classes - PC and Phone) and realization (Lightning interface with 3 classes TypeCLightning, AppleLightning, MicroUsbLightning). If we create for every device different realization of lightning than we will have 6 classes at all (PhoneWithTypeCLightning, PhoneWithAppleLightning, PhoneWithMicroUsbLightning, PcWithTypeCLightning, PcWithAppleLightning, PcWithMicroUsbLightning).
But if we aggregate the lightning interface to Device class, then we will have the relation between them (which calls **bridge**). And there we will need to realize only 5 classes 2 classes of device, and 3 implementation of lightning interface. 

### Good sides 
* If we want to make a change in Lightning interface than we need only to take a change in his realizations, but if we don't follow this pattern then we need to take changes to all of these classes (PhoneWithTypeCLightning, PhoneWithAppleLightning, PhoneWithMicroUsbLightning, PcWithTypeCLightning, PcWithAppleLightning, PcWithMicroUsbLightning).
* Reduced the amount of class