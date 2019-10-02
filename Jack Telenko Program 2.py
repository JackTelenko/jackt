#CS 127 MWF 9:00
#Jack Telenko
#Program 2 Cribbage


def print_hand(hand):
    print("Cribbage hand")
    print("-------------")
    for i in range(len(hand)):
        print ("Card", str(i+1)+":",str(hand[i][0]), "of", hand[i][1])    
def pair(hand):
    total = 0
    if hand[0][0] == hand[1][0] and hand[0][0] != hand[2][0]:
        total += 2
    elif hand[0][0] == hand[2][0] and hand[0][0] != hand[1][0]:
        total += 2
    elif hand[1][0] == hand[2][0] and hand[1][0] != hand[0][0]:
        total += 2
    else:
        total += 0

    return total
    

def threeOfKind(hand):
    result = 0

    if hand[0][0] == hand[1][0] == hand[2][0]:
        result += 6
    else:
        result += 0
        
    return result

def fifteen(hand):
    result = 0

    if hand[0][0] + hand[1][0] + hand[2][0] == 15:
        result += 2
    if hand[0][0] + hand[1][0] == 15:
        result += 2
    if hand[0][0] + hand[2][0] == 15:
        result += 2
    if hand[1][0] + hand[2][0] == 15:
        result += 2

    return result

def sequence(hand):
    total = 0
    hand.sort()
    if hand[0][0] + 1 == hand[1][0] and hand[1][0] + 1 == hand[2][0]:
        total += 3
    else:
        total += 0
    return total
    
def evaluate_hand(hand):
    total = pair(hand) + threeOfKind(hand) + sequence(hand) + fifteen(hand)
    print("Total Points = ", total)
    print()

def process_hands(cribbage_input, cards_in_hand):    

    for hand in cribbage_input:
        hand = hand.split()
        hand_as_list = []
        for i in range(cards_in_hand):
            hand_as_list.append([int(hand[0]), hand[1]])
            hand = hand[2:]
        print_hand(hand_as_list)
        evaluate_hand(hand_as_list)

# --------------------------------------

def main():
    cribbage_file= open("cribbage.txt", "r")
    process_hands(cribbage_file, 3)
    cribbage_file.close()

# --------------------------------------

main()
