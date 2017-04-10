namespace java jc.facade.thrift.helloworld

struct TUser{
    1:string username,
    2:string nickname,
    3:i32 age
}

exception InvalidOperation{
    1:i32 code,
    2:string message
}

service Helloworld{
    TUser getUser(1:string username);

}