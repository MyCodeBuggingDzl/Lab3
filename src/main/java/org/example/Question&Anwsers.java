/*
           Part B
         1. m.getName() will allow us to get the name
         2. m.getSalary will get the salary
         3. m.getManagementAllowance() will get the management allowance
         4. m. calculateBonus will allow us to calc the bonus.
         (All in the Manager class)

           Part C
         1. Employee will print first because without a parent class, child will not exist.

           Part D
         A. Salary should be protected so the child class can have access.
         1. Yes, it can read & write.
         2. Yes, in here breakSalary gives a negative value.
         3. No, it's weaker, the parent class will be dependant to the child class.
         4. Yes,  a private, a protected will risk to have a invalid state.

           Part E
         A. Because the subclass have control over it.
         1. I would use protected to safely modify the data. It's much safer when there's
            a lot of child. It is way better if you want to raise the salary of a single employee.

           Part F
         1. To safely modify a data, design B safely modifies the data with a validation. And Design A can be invalid data.

           Part G
         1.  A private can make it read only.

           Part H
         1. It inherits the salary field since it extends employee. The Object itself its being accessed.
            Java lets a child in a another package only for its own instance.
         2. The method is calling salary like another subclass. The object accessed is like an argument.
            And the package are different so the test manager cant look.

           Part I
         1. Since salary is protected any subclass can access it or any class in the same package.
         */
