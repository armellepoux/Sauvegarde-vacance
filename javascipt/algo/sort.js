var array=[2,1,4,5,10,8,-2];
//console.log(array.sort()); //affiche le tableau
//console.log(10<2); //affiche false

function sort(array)
{
    var worker=array.slice(); //JS trick to copy
    


        for(var i=0;i<worker.length;i++)
        {
            var hasSwapped=false;
            for(var j=0;j<worker.length-i;j++)
            {
                if(worker[j]>worker[j+1])
                {
                swap(worker,j);
                hasSwapped=true;
                }
            }
            if(hasSwapped==false)
            {
                console.log('Has not swapped for i=',i)
                break;
            }
        }

    return worker;
}

/*
*return a mutated swap array
*/

function swap(array,i)
{
    //Guards; defensive programming
    if(array.length<2)
    {
        return array;
    }
        if(i>=array.length)
    {
        throw 'Bad array size'; //throw permet d'expliquer pourquoi le programme a plente
    }
    buffer=array[i+1];
    array[i+1]=array[i];
    array[i]=buffer;
    return array;
}

    // swap([2,3],0)==[3,2]
    // swap([2,3,4],0)==[3,2,4]
    // swap([2,3,4],1)==[2,4,3]
    // swap([2],0)==[2]


    // swap([2],1)!=[2];

// console.log(sort(array));

console.log(swap([2,3],0).toString()==[3,2].toString())
console.log(swap([2,3,4],0).toString()==[3,2,4].toString)

console.log(sort(array));