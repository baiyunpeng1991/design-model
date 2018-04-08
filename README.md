# design-model

## 良好的OO设计:  
&nbsp;&nbsp;&nbsp;可复用  
&nbsp;&nbsp;&nbsp;可扩展  
&nbsp;&nbsp;&nbsp;可维护  
  
## OO基础:  
&nbsp;&nbsp;&nbsp;抽象  
&nbsp;&nbsp;&nbsp;继承  
&nbsp;&nbsp;&nbsp;封装  
&nbsp;&nbsp;&nbsp;多态  
  
## OO原则:  
**&nbsp;&nbsp;&nbsp;封装变化  
**&nbsp;&nbsp;&nbsp;面向接口编程  
**&nbsp;&nbsp;&nbsp;多用组合，少用继承  
**&nbsp;&nbsp;&nbsp;为了交互对象之间的松耦合设计而努力；松耦合设计更有弹性，更能应对变化  

## OO模式:  
## *&nbsp;&nbsp;&nbsp;观察者模式--Observer*:  
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;特点：  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1，在对象之间定义一对多的依赖，当subject对象的状态改变时候，依赖他的对象会收到通知，自动更新；  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2，一个新的模式，以松耦合方式在一系列对象之间沟通状态。  
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应用：RMI，JavaBean等


|缺点(java.util.Observabled)|优点|  
|:--:|:--:|
|违反了面向接口编程|Subject与Observer之间松耦合，互不知晓实现，更改后互不影响|
|违反了多用组合，少用继承的原则|Subject可以主动推送或者由Observer主动拉取|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|多个观察者时，不可依赖特定的通知顺序|


