import re


class User:		# here's what we have so far
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account_balance = 0
     # adding the deposit method

    # takes an argument that is the amount of the deposit
    def take_dipposit(self, amount):
        # the specific user's account increases by the amount of the value received
        self.account_balance += amount
    def make_withdrawal(self, amount):
        # the specific user's account increases by the amount of the value received
        self.account_balance -= amount    

    def display_user_balance(self):
        print("User", self.name, "Account", self.account_balance)

    # def BONUS: transfer_money(self, other_user, amount):

    def transfer_money(self, other_user, amount):
        self.account_balance=amount
        other_user.account_balance=other_user.account_balance- amount 


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