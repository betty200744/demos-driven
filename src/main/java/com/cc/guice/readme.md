
### animal:
* Create injectors with module that configure   the instance Bindings
* Instance Bindings is the bind interface to impl
* Get instance by injector

### greeter
* provider binding, binding the Integer.class to Instance 3 with annotation "Count.class"
  * alternative：
    * bind(Integer.class).annotatedWith(Count.class).toInstance(3);
      * bindConstant().annotatedWith(Count.class).to(3);
* provider binding, binding the Sting.class to Instance "hello" with annotation "Message.class"
  * alternative：
    * bind(String.class).annotatedWith(Message.class).toInstance("hello");
    * bindConstant().annotatedWith(Message.class).to("hello");