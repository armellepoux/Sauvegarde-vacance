const inputs=[2,5,6,3,0,-12,34];

function quickSort(array)
{
    if(array.length==0)
    {
        return [];
    }
    const smalls=[], bigs=[];
    const first=array[0];

for(var i=1;i<array.length;i++)
{
    const current=array[i];
    if(current<first)
    {
        smalls.push(current); //push modifie le tableau
    }
    else
    {
        bigs.push(current);
    }
}

    return quickSort(smalls).concat(first).concat(quickSort(bigs)); //concat renvoit un nouveau tableau
}
console.log(quickSort(inputs));

//Ici le programme est recursif. On prend une valeur de reference (ici la premiere du tableau) puis on trie : petit a gauche grand a droite. 
//Ensuite on trie le tableau a droite et celui a gauche de maniere recursive.