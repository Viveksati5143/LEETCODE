remove efficient:
```
public int pop() {
return first.pop();
}
```
// but here add will also change
```
public int push(int item) {
while(!first.isEmpty()){
second.push(first.pop());
}
first.push(item);
while(!second.isEmpty()){
first.push(second.pop());
}
}
```
```
public int peek() {
return first.peek();
}
```