## 依赖方向
application -> config -> adapter -> usercase -> domain

## 比较牛的是
usercase 里用的是接口来实现功能，然后交给 adapter 里面具体来实现

config 对其进行汇总
