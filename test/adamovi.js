getNodes = function() {
  nodeDataArray = [
    {
      key: 0,
      color: 'lightblue',
      parent: 0,
      name : 'Adam ',
    },
      
      {
        key: 1,
        color: 'lightblue',
        parent: 0,
        name : 'Abel ',
      },
        
      {
        key: 2,
        color: 'lightblue',
        parent: 0,
        name : 'Cain ',
      },
        
        {
          key: 3,
          color: 'lightblue',
          parent: 2,
          name : 'Enoch ',
        },
          
          {
            key: 4,
            color: 'lightblue',
            parent: 3,
            name : 'child1 ',
          },
            
          {
            key: 5,
            color: 'lightblue',
            parent: 3,
            name : 'child2 ',
          },
            
      {
        key: 6,
        color: 'lightblue',
        parent: 0,
        name : 'Seth ',
      },
        
        {
          key: 7,
          color: 'lightblue',
          parent: 6,
          name : 'Enos ',
        },
          
      {
        key: 8,
        color: 'salmon',
        parent: 0,
        name : 'd2 ',
      },
        
      {
        key: 9,
        color: 'salmon',
        parent: 0,
        name : 'd1 ',
      },
        
      {
        key: 10,
        color: 'salmon',
        parent: 0,
        name : 'd3 ',
      },
        
  ];
  return nodeDataArray;
  }
