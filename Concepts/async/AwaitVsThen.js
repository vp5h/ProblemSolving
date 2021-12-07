// async function test() {
//   console.log('Ready');
//     try{

//   let example = await fetch('http://httpbin.org/get');
//     }catch(err){

//   console.log(err, 'I will print second');
//     }
// }

// test();
// console.log('I will print first');
//TO be tried with HTML pages, Fetch is a browser API


function test() {
    console.log('Ready');
    let example = fetch('http://httpbin.org/get').then((res) => {
      console.log('This is inside the then() block');
    }).catch(err=> console.log(err," This is inside the catch() block"));
    console.log('This is after the fetch statement where we are now executing other code that is not async');
  
  }
  
  test();
  console.log('this is after the entire function');