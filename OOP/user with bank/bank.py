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
        elif self.balance>5:
            print("Insufficient funds: Charging a $5 fee")
            
            self.balance-=5
        return self
    def display_account_info(self):
        
        print( "Account", self.balance)
        return self

    def yield_interest(self):
        
        if  self.balance >= 1:
            self.balance+=self.balance*self.int_rat
            return self


account1=BankAccount(0.05,0)
account2=BankAccount(0.04,200)


# account1.deposit(20).deposit(10).deposit(20).withdraw(100).yield_interest().display_account_info()
# account2.deposit(30).deposit(40).withdraw(10).withdraw(20).withdraw(15).withdraw(15).yield_interest.display_account_info()



class User:		# here's what we have so far
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account=BankAccount(int_rate=0.02,balance=0)
     

    # takes an argument that is the amount of the deposit
    def take_dipposit(self,amount):
        # the specific user's account increases by the amount of the value received
        self.account.balance+=amount
        

    def make_withdrawal(self,amount):

        self.account.balance+=amount
        


    def display_user_balance(self):
        
        print("User", self.name, "Account",self.account.balance)

   

    def transfer_money(self, other_user, amount):
        self.account.balance=amount
        other_user.account.balance =other_user.account.balance - amount 


print("----------------")
ahmad = User("Ahmad","afecac@eafrg.com")
ahmad.take_dipposit(100)
ahmad.take_dipposit(200)
ahmad.take_dipposit(300)
ahmad.make_withdrawal(50)
ahmad.display_user_balance()

print("----------------")
ameer=User("Ameer","afesaefws@eafrg.com")
ameer.take_dipposit(100)
ameer.take_dipposit(200)
ameer.make_withdrawal(30)
ameer.make_withdrawal(50)
ameer.display_user_balance()

print("----------------")
sura=User("Sura","Sura-s@eafrg.com")
sura.take_dipposit(100)
sura.make_withdrawal(10)
sura.make_withdrawal(20)
sura.make_withdrawal(40)
sura.display_user_balance()


print("--------Bouns--------")
ameer.transfer_money(ahmad,20)
ameer.display_user_balance()
ahmad.display_user_balance()