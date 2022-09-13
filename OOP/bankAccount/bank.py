class BankAccount:
    # don't forget to add some default values for these parameters!
    def __init__(self, int_rate, balance):
        self.int_rat=int_rate
        self.balance=balance
        # your code here! (remember, this is where we specify the attributes for our class)
        # # don't worry about user info here; we'll involve the User class soon

    def deposit(self, amount):
        # your code here
         self.balance += amount
         return self

    def withdraw(self, amount):
        if  self.balance-amount>0:
            self.balance -= amount
        else:
            print("Insufficient funds: Charging a $5 fee")
            self.balance-=5
        return self
    def display_account_info(self):
        
        print( "Account", self.balance)
        return self

    def yield_interest(self):
        
        if  self.balance <= 0:
            self.balance+=self.balance*self.int_rat
            return self


account1=BankAccount(0.05,0)
account2=BankAccount(0.04,200)


account1.deposit(20).deposit(10).deposit(20).withdraw(100).display_account_info()
account2.deposit(30).deposit(40).withdraw(10).withdraw(20).withdraw(15).withdraw(15).display_account_info()

