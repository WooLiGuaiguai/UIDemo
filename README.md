# UIDemo
主要是ListView和RecyclerView的相关使用 

1. ListViewDemo里面主要是ListView的相关学习

- app--使用String数组为listview添加数据的实现
1. 创建页面布局，里面设置好list_view
2. 创建String[]data数组 
3. MainActivity中获取listview和adapter，data数据添加到adapter中，最后将adapter中的数据添加到listview
      
- entrieslistview--使用静态数组为listview添加数据
1. res/values/arrays.xml 提前写入数据
2. 布局文件中ListView增加属性android:entries
3. MAinActivity不需要进行修改 直接加载布局文件即可

ArrayAdapter的参数说明：  
第一个参数：context上下文对象  
第二个参数：每一个item的样式，可以使用系统提供，也可以自定义就是一个TextView  
第三个参数：数据源，要显示的数据  
系统提供的item的样式：  
simple_list_item1:单独的一行文本框  
simple_list_item2:有两个文本框组成  
simple_list_item_checked每项都是由一个已选中的列表项  
simple_list_item_multiple_choice:都带有一个复选框  
simple_list_item_single_choice：都带有一个单选框  

- SimpleAdapter--简单适配器，添加的不仅是文本，还可以有其他控件  
1. 创建页面布局，里面设置好list_view  
2. 设置item格式，主要是一个列表中每项的格式  
3. 定义数据数组，准备数据源  
4. 将数据源添加到适配器，将适配器添加到listview  

simpleAdapter中五个参数的  
第一个参数：上下文对象  
第二个参数：数据源是含有Map的一个集合  
第三个参数：每一个item的布局文件  
第四个参数：new String[]{}数组，数组的里面的每一项要与第二个参数中的存入map集合的的key值一样一一对应  
第五个参数：new int[]{}数组，数组里面的第三个参数中的item里面的控件id。   


