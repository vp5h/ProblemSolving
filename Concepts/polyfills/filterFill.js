
var logicAlbums = [
    {
      name: 'Bobby Tarantino',
      rating: 5,
    },
    { name: 'The Incredible True Story', rating: 4.5 },
    {
      name: 'Supermarket',
      rating: 4.9,
    },
    { name: 'Under Pressure', rating: 5 },
  ]

  
  console.log(logicAlbums.filter(alb=> (alb.rating> 4.9)))
  
  Array.prototype.MyFilter = function(callback, context){
      var arr=[]
      for (var i = 0; i < this.length; i++){
          if(callback.call(context, this[i], i, this )){
            arr.push(this[i])
          }
        }
      return arr  
    }
    
    
console.log(logicAlbums.MyFilter(alb=> (alb.rating> 4.9)))