# ---------------------------------------
# CSCI 127, Joy and Beauty of Data
# Program 3: Msuic CSV Library
# Jack Telenko
# Last Modified: October 18, 2018 
# ---------------------------------------
# Answers questions about song excel sheet asked in #1-5.
# ---------------------------------------

# --------------------------------------
def menu():
    print()
    print("1. Identify longest song.")
    print("2. Identify number of songs in a given year.")
    print("3. Identify all songs by a given artist.")
    print("4. Enter an artists name to request their identification code.")
    print("5. Quit.")

def longest_song():
    file = open("music.csv", "r")
    file.readline()
    longest = [0,'placeHolder']
    for line in file:
        row = line.split(",")
        if float(row[9]) > longest[0]:
            longest[0] = float(row[9])
            longest[1] = row[33]
    print("Title:", longest[1])
    print("Length to nearest second:", round(longest[0]))
    file.close()

def songs_by_year(year):
    file = open("music.csv", "r")
    file.readline()
    numSongs = 0
    file.readline()
    for line in file:
        row = []
        row = line.split(',')
        if int(row[len(row)-1])== int(year): 
            numSongs += 1
    print ("The number of songs from", year, "is", numSongs)
    file.close()
    
def all_songs_by_artist(artist):
    file = open("music.csv", "r")
    file.readline()
    alist = []
    count = 0
    print("Songs in alphabetical order")
    print("---------------------------")
    for line in file:
        row = line.split(",")
        song = row[len(row)-14]
        if artist.upper() == row[2].upper():
            alist.append(song)
    alist.sort()
    for song in alist:
        count += 1
        print(str(count) + " " + song)
    print("---------------------------")
    file.close()

def artist_id(artist):
    file = open("music.csv", "r")
    file.readline()
    alist = []
    for line in file:
        row = line.split(",")
        ident = row[len(row)-34]
        if artist.upper() == row[2].upper():
            alist.append(ident)
    for ident in alist:
        pass
    print("The artist id for", artist, "is", ident)
    file.close()
    return ident
# --------------------------------------

def main():
    choice = 0
    while (choice != 5):
        menu()
        choice = int(input("Enter your choice: "))
        if (choice == 1):
            longest_song()
        elif (choice == 2):
            year = int(input("Enter desired year: "))
            songs_by_year(year)
        elif (choice == 3):
            artist = input("Enter name of artist: ").lower()
            all_songs_by_artist(artist)
        elif (choice == 4):
            artist = input("Enter artist name: ").lower()
            artist_id(artist)
        elif (choice != 5):
            print("That is not a valid option.  Please try again.")


main()
