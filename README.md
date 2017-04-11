# Casino Simulation

This is the result of me getting bored at 1am on a Sunday night (or Monday morning I guess). I was listening to a talk on exploration/exploitation, and wanted to implement some variation of the multi-armed bandit problem.

# Win stay, Lose Shift

The gambler will be using the classic "win stay, lose shift" algorithm to determine which slot machine he will be using. If the gambler wins, he stays in the current machine. However if they lose, they will switch to the machine which has the best historic payout.


# Machine and MachineManager
Each slot machine is represented by a Machine object, and all the machines are managed by the MachineManager object. The MachineManager holds all of the machines in a list, and manages which machine is the "current" one using a stack ( in hindsight, I just realized while typing this that the stack is totally unnecessary in this case since I just need to point to the current machine - I would fix this but I really need some sleep)
