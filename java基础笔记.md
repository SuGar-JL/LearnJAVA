# java基础笔记

……

前有很多没记

……

类的首字母大写，变量的首字母小写，java关键字都是首字母小写

![image-20200621180609343](C:\Users\DELL\AppData\Roaming\Typora\typora-user-images\image-20200621180609343.png)

任何数据类型都可以作为方法的参数和返回值。

### 面向对象

#### 类

四部分：属性用private、无参构造方法、全参构造方法、getter和setter。 

### Scanner类的使用

导包：`import java.util.Scanner;`

创建对象：`Scanner sc = new Scanner(System.in);//从键盘输入`

常用成员方法：

输入int数字：`sc.nextInt();`

输入字符串：`sc.next();`

……其它的请参考API文档

注意：其实键盘输入的都是字符串，只不过通过相应的成员方法转换成了对应的数据类型。

### 匿名对像

没有对象名

创建：`new ObjName();`

使用：只能使用一次，如：`int age = new Person().age;`

注意：也可作为函数的参数与返回值。

### Random类的使用

与Scanner类相似

导包：`import java.util.Random;`

创建对象：`Random r= new Random();`

使用方法距离：

int随机数字（int数据范围）：`r.nextInt();`

int随机数字（int数据指定范围）：

`r.nextInt(5);//[0,5)`

`r.nextInt(5)+1;//[1,5]`

……其它的请参考API文档`

### 对象数组

用数组array存放对象类型的数据，如下：

`Person[]  array= new Person[3]//Person为一个对象`

其它操作与数组一样。

### ArrayList集合

与数组不一样，数组长度在程序运行时不可改变，但是ArrayList可以。

导包：`import java.util.ArrayList;`

创建：`ArrayList<E> list = new ArrayList<>();//E为泛型，表示ArrayList能存放的数据类型，Jdk1.7+右侧的<>中不用写E，留空即可（引用类型名）`

##### 泛型：`只能是引用类型不能是基本类型`

基本类型：

①整数类型：`long、int、short、byte`
②浮点类型：`float、double`
③字符类型：`char`
④布尔类型：`boolean`

引用类型：`类、 接口类型、 数组类型、 枚举类型、 注解类型、 字符串型String`

直接打印list（未加入值）：`System.out.println(list);//与数组不同，输出不是地址值，而是[]`

常用成员方法：

`public boolean add(E e)`：向集合中添加元素，参数的类型和泛型一致，返回值表示添加操作是否成功。

`publict E get(int index)`：通过索引编号从集合中获取元素。

`public E remove(int index)`：通过索引编号删除集合中的元素，返回删除的元素。

`public int size()`：获取集合的长度，即集合中的元素个数。

```java
ArrayList<String> list = new ArrayList<>();
boolean f = list.add("迪丽热巴");//true
list.add("古力娜扎");
list.add("马尔扎哈");
System.out.println(list);//["迪丽热巴","古力娜扎","马尔扎哈"]
String name = list.get(0);//迪丽热巴
String name = list.remove(1);//古力娜扎
System.out.println(list);//["迪丽热巴","马尔扎哈"]
int len = list.size();//2
//遍历集合
for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
}
/*
迪丽热巴
马尔扎哈
*/
```

ArrayList存储基本类型数据：

错误写法：

```java
ArrayList<int> list = new AeeayList<>();//错误写法，泛型只能是引用类型
```

存储基本数据类型需要对应的“包装类”。

基本类型				包装类（引用类型，都位于java.lang包下，所以不用导包）

byte						Byte

short					  Short

int						   Integer		【特殊】

long						Long

float						Float

double					Double

char						Character	【特殊】

boolean				Boolean

注意：从ArrayList集合中获取基本类型数据时，不需要手动进行类型转换，直接用对应的基本类型变量接收即可：

基本类型--->包装类：自动装箱

包装类--->基本类型：自动拆箱

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(100);
list.add(200);
list.add(300);
int num = list.list.get(1);//200
```

### 字符串（String）

查阅API文档：

包：java.lang（无需导包）

注意：在所写的程序中，所有的双引号字符串，如“abc”都是String类的对象（实例），即使没有new，同样是。

特点：

1.字符串是常量，一经创建，内容永不可变，因此可共享使用。

```java
String str = "hello";
System.out.println(str);//hello
str = "Java";
System.out.println(str);//Java
/*
注意：以上操作只是改变了str对应的地址值，内存中依然有"hello"和"Java"两个字符串，因此说字符串内容不可改变，（若感觉变了，那就是创建了一个新的）。
*/
```

2.效果上相当于char[]数组，但底层原理是byte[]数组。

创建（3+1）：

三种构造方法：

public String()：空白字符串，相当于""。

```java
String str1 = new String();//""
```

public String(char[] array)：根据字符数组内容创建字符串。

```java
char[] charArray= {'A','B','C'};
String str2 = new String(charArray);//"ABC"
```

public String(byte[] array)：根据字节数组内容创建字符串。ASCII码

```java
byte[] byteArray= {97,98,99};//a,b,c的ASCII码
String str3 = new String(byteArray);//"abc"
```

一种直接创建：

```java
String str4 = "hello";//实际上JVM进行了new操作
```

字符串常量池：

``` java
String str1 = "abc";
String str2 = "abc";
char[] charArray = {'a','b','c'};
String str3 = new String(charArray);
/*
对于基本类型，==操作是进行数值的比较
对于引用类型，==操作是进行地址值的比较
*/
System.out.println(str1==str2);//true,因地址相同
System.out.println(str1==str3);//false,地址不同
System.out.println(str2==str3);//false,地址不同
```

直接用双引号创建的字符串，就在字符串常量池中。

![image-20200628151344893](C:\Users\DELL\AppData\Roaming\Typora\typora-user-images\image-20200628151344893.png)

字符串常用方法：

1.字符串比较：

对象使用==是进行地址值的比较，若要进行值的比较，可用以下两个方法：

public boolean equals(Object obj)：参数可以是任何对象，只有参数是字符串，并且内容相同时才会返回true，否则发挥false。

public boolean equalsIgnoreCase(String str)：忽略大小写进行内容比较，注意参数是字符串。

```java
String str1 = "abc";
String str2 = "abc";
char[] charArray = {'a','b','c'};
String str3 = new String(charArray);
System.out.println(str1.equals(str2));//true
System.out.println(str1.equals(str3));//true
System.out.println(str2.equals(str3));//true
System.out.println(str2.equals("abc"));//true
System.out.println("abc".equals(str2));//true
System.out.println("Abc".equals(str2));//true
/*
注意事项：
1.任何对象都可以使用Object进行接收。
2.equals方法具有对称性，即a.equals(b)和b.equals(a)效果一样。
3.基于2，对于常量与变量的比较，推荐将常量写在前面，即"abc".equals(str)，否则当str是null时，会报错（空指针异常：NullPointerException）
*/
```

2.字符串获取相关：

public int length()：获取字符串的长度。

public String concat(String str)：将当前字串与参数字符串进行拼接，得到新字符串。

pbulic char charAt(int index)：获取字符串中指定索引位置的单个字符，（索引从0开始）。

public int indexOf(String str)：获取参数字符串在当前字符串中首次出现的索引位置，若不存在，返回-1。

3.字符串截取方法：

public String substring(int index)：截取从参数索引位置开始到父字符串结尾，返回新字符串。

public String substring(int begin, int end)：截取从begin开始到end结束的之间的字符串，范围为[begin,end)。

4.字符串转换+替换：

public char[] toCharArray()：将当前字符串拆分为对应的字符数组并返回。

public byte[] getBytes()：获得当前字符串的底层字节数组。

public String replace(CharSequence oldString, CharSequence newString)：将当前字符串中所有出现的老字符串替换为新字符串，并返回处理后的字符串。

5.字符串切割：

public String[] split(String regex)：根据参数的规则（正则表达式）将字符串切分为若干部分。

```java
String str = "aaa,bbb,ccc";
String[] array = str.split(",");//["aaa","bbb","ccc"]
//注意：按照英文句点”.“进行节分时，要进行转义，使用"\\."
String str = "aaa.bbb.ccc";
String[] array = str.split(".");//错误写法，没有值
String[] array = str.split("\\.");//正确写法，["aaa","bbb","ccc"]
```

