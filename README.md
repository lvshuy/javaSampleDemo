# javaSampleDemo
一些Java程序小例子



### java面向对象编程

![](E:\GITHUB\javaSampleDemo\images\11.png)



![]( E:\GITHUB\javaSampleDemo\images\12.png)



![]( E:\GITHUB\javaSampleDemo\images\13.png)



![]( E:\GITHUB\javaSampleDemo\images\15.png)



![]( E:\GITHUB\javaSampleDemo\images\16.png)



![]( E:\GITHUB\javaSampleDemo\images\17.png)



![](E:\GITHUB\javaSampleDemo\images\18.png)



![](E:\GITHUB\javaSampleDemo\images\19.png)

![](E:\GITHUB\javaSampleDemo\images\20.png)

## Java核心API编程

> 项目为javaCoreAPI

### 1.集合框架与泛型

![](E:\GITHUB\javaSampleDemo\images\21.png)



![](E:\GITHUB\javaSampleDemo\images\22.png)

数组定义：

```java
//简化格式：   数据类型 数组名称 = {值, 值,…}
int data[] = {1, 2, 4, 545, 11, 32, 13131, 4444};
//完整格式： 数据类型 数组名称 = new 数据类型[] {值, 值,…}
int[] data1 = new int[]{1, 2, 4, 545, 11, 32, 13131, 4444};
//二维数组
int[][] data1 = new int[][]{{1, 2, 4},{545, 11},{32, 13131, 4444}};
```

#### List接口

数组和ArrayList：**

| 数组                        | ArrayList                          |
| --------------------------- | ---------------------------------- |
| int[] data = new int[3];    | ArrayList list1 = new ArrayList(); |
| 数组长度不变                | 长度可变                           |
| 可通过.length获取数组的长度 | 通过.size()获取List的元素个数      |



**ArrayList 类的常用方法**

| 方法                            | 说明                                                         |
| :------------------------------ | ------------------------------------------------------------ |
| boolean add(Object o)           | 在列表末尾添加元素o，起始索引位置从0开始                     |
| void add(int index, Object o)   | 在列表的指定位置插入元素o，索引位置必须介于0和列表中元素个数之间。 |
| int size()                      | 返回列表中的元素个数。                                       |
| Object get(int index)           | 返回列表中指定位置的元素，取出的元素是Object类型，使用前需要进行强制类型转换。 |
| void set(int index, Object obj) | 将index索引位置的元素替换为obj。                             |
| boolean contains(Object o)      | 如果此列表包含指定的元素，则返回 `true` 。                   |
| int indexOf(Object o)           | 返回此列表中指定元素的第一次出现的索引位置，如果此列表不包含元素，则返回-1。 |
| Object remove(int index)        | 删除该列表中指定位置的元素。                                 |
| boolean remove(Object o)        | 从列表中删除元素o，起始索引位置从0开始。                     |

LinkedList 为链表，允许元素值为任何数据，包括null。

**LinkedList 类的常用方法**

| 方法                      | 说明                             |
| ------------------------- | -------------------------------- |
| void addFirst(Object obj) | 将指定元素插入到当前集合的首部   |
| void addLast(Object obj)  | 将指定元素插入到当前集合的尾部   |
| Object getFirst()         | 获得当前集合的第一个元素         |
| Object getLast()          | 获得当前集合的最后一个元素       |
| Object removeFirst()      | 删除并返回当前集合的第一个元素   |
| Object removeLast()       | 删除并返回当前集合的最后一个元素 |

#### Set接口

存储一组不唯一、无序的对象

在不知道数据索引时，使用ArrayList也要遍历全部数据，这时使用 HashSet 查找效率高。



HashSet 集合的特点：

- 集合内的元素是无序的
- HashSet类是非线程安全的
- 允许集合元素值为null



HashSet 类的常用方法

| 方法                       | 说明                                              |
| -------------------------- | ------------------------------------------------- |
| boolean add(Object o)      | 如果此时Set中尚未包含指定元素o，则添加指定元素o。 |
| void clear()               | 移除集合中所有元素                                |
| int size()                 | 求元素数量                                        |
| boolean isEmpty()          | 如果集合中不包含任何元素，返回true                |
| boolean contains(Object o) | 如果集合中包含元素o，返回true                     |
| boolean remove(Object o)   | 如果元素o在集合中，则将其移除                     |

#### Iterator接口



### 2.实用类

![](E:\GITHUB\javaSampleDemo\images\23.png)



![](E:\GITHUB\javaSampleDemo\images\24.png)



![](E:\GITHUB\javaSampleDemo\images\25.png)



![](E:\GITHUB\javaSampleDemo\images\26.png)



![](E:\GITHUB\javaSampleDemo\images\27.png)





