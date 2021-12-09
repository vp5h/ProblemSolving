Array.prototype.MyFind = function(callback, context){

    for(let i = 0; i<this.length; i++){
            if(callback.call(context, this[i], i, this)){
                return this[i]
            }
    }

}

var arr = [1,2,3,4,5,6]

console.log(arr.MyFind((x)=>x>4))