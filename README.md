# design-model

## 良好的OO设计:  
#### &nbsp;&nbsp;&nbsp;可复用:  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1,继承inheritance  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2,组合component  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3,委托delegation  
*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;其中2,3具有运行时继承的效果*  
#### &nbsp;&nbsp;&nbsp;可扩展  
#### &nbsp;&nbsp;&nbsp;可维护  

## 设计步骤:  
&nbsp;&nbsp;&nbsp;*1,找出程序中会变化的部分，然后将其与不变的方面相分离（不变的可作为继承复用，变化的使用多态实现复用）;*  
&nbsp;&nbsp;&nbsp;*2,针对接口编程，将变化的行为（算法族）抽象成接口；而非实现;（可扩展）*  
&nbsp;&nbsp;&nbsp;*3,利用多态实现多用组合，少用继承;（可复用，可维护）*  


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
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1，在对象之间定义**一对多的依赖**，当subject对象的**状态改变**时候，依赖他的对象会收到通知，自动更新;  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2，一个新的模式，以松耦合方式在一系列对象之间沟通状态。  
### &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;应用：RMI，JavaBean等


|缺点(java.util.Observabled)|优点|  
|:--:|:--:|
|违反了面向接口编程|Subject与Observer之间松耦合，互不知晓实现，更改后互不影响|
|违反了多用组合，少用继承的原则(如setChanged()方法必须强制复写后才能将此方法与创建的Observable实例组合)|Subject可以主动推送或者由Observer主动拉取|
|&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|多个观察者时，不可依赖特定的通知顺序|

### OO原则在Observer模式中的体现  
|  OO原则  |  体现  |
|:------:|:------:|
|封装变化|在模式中，Subject的主题状态和Observer的数量是变化的，封装Observer的变化和主题，使其变化不会互相影响，独立变化|
|面向接口编程|Subject与Observer互相持有彼此接口，通过接口来进行数据交互，对实现没有互相依赖，实现松耦合|
|多用组合|Subject持有Observer的实现类列表，即对象之间的关系是运行时通过组合实现的，而非继承|
