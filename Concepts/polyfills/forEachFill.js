// Array.prototype.MyForEach = function(callback){
//     for (var i = 0; i < this.length; i++){
//         callback(this[i], i, this)
//         console.log(callback)
//     }
// }

Array.prototype.MyForEach = function(callback){
	for(let i = 0 ; i<this.length; i++){
		callback(this[i], i, this)
}
}

var logicAlbums = [
    'Bobby', 'The Incredible True Story', 'supermarket', 'underPressure'
]

logicAlbums.MyForEach(word=>{console.log(word)})
// logicAlbums.forEach(word=>{console.log(word)})