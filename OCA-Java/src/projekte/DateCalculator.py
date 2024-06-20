""" Dieses Programm berechnet den Zeitunterschied zwischen einem
vom Benutzer eingegebenen Datum und dem heutigen Datum.

Funktionsweise:

Eingabe: Der Benutzer wird wiederholt aufgefordert,
ein Datum im Format JJJJ-MM-TT einzugeben.

Überprüfung: Das eingegebene Datum wird auf Gültigkeit überprüft.
Wenn es ungültig ist (falsches Format), wird eine Fehlermeldung
angezeigt und der Benutzer muss es erneut versuchen.

Berechnung: Sobald ein gültiges Datum eingegeben wurde,
berechnet das Programm die Differenz in Jahren, Monaten,
Tagen und Gesamtstunden zwischen dem eingegebenen Datum und
dem heutigen Datum. Es berücksichtigt auch Schaltjahre und
negative Unterschiede (z. B. wenn der eingegebene Tag vor dem heutigen Tag liegt).

Ausgabe: Das Programm gibt die Ergebnisse übersichtlich aus, einschließlich:
-Jahre, Monate und Tage des Unterschieds
-Gesamtstunden des Unterschieds (auf zwei Dezimalstellen gerundet)
-Wochentag des eingegebenen Datums
-Ob das eingegebene Jahr ein Schaltjahr war oder nicht """



from datetime import datetime, date

def calculate_date_difference():
    while True:
        try:
            # Get input dates
            print("\n****************************************")
            date_str = input("Enter a date (YYYY-MM-DD): ")
            input_date = datetime.strptime(date_str, "%Y-%m-%d").date()
            today = date.today()

            # Calculate differences
            years_diff = today.year - input_date.year
            months_diff = today.month - input_date.month
            days_diff = today.day - input_date.day

            # Adjust for negative differences
            if days_diff < 0:
                months_diff -= 1
                days_diff += input_date.replace(month=input_date.month % 12 + 1, day=1).day - 1  # Days in previous month
            if months_diff < 0:
                years_diff -= 1
                months_diff += 12

            # Calculate total hours
            total_hours = (today - input_date).total_seconds() / 3600

            # Determine day of the week and leap year
            day_of_week = input_date.strftime("%A")
            is_leap_year = input_date.year % 4 == 0 and (input_date.year % 100 != 0 or input_date.year % 400 == 0)

            # Display results
            print(f"\nTime difference between {input_date} and {today}:")
            print(f"Years: {years_diff}")
            print(f"Months: {months_diff}")
            print(f"Days: {days_diff}")
            print(f"Total Hours: {total_hours:.2f}")  # Rounded to 2 decimal places
            print(f"\nDay of the week: {day_of_week}")
            print(f"Was a leap year: {is_leap_year}")

            break  # Exit loop if input is valid

        except ValueError:
            print("Invalid date format. Please use YYYY-MM-DD.")

if __name__ == "__main__":
    calculate_date_difference()

