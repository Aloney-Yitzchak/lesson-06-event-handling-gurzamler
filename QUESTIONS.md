# שאלות (QUESTIONS)

## שאלות שעלו לי במהלך המשימה:
1.  **למה משתמשים ב-`toString()`?**
    - ה-`getText()` של `EditText` מחזיר אובייקט מסוג `Editable`, ולא `String` רגיל. לכן צריך להמיר אותו כדי לבצע פעולות על הטקסט.
2.  **מה ההבדל בין `OnClickListener` ל-`LongClickListener`?**
    - ה-`OnClickListener` מגיב ללחיצה קצרה, וה-`LongClickListener` מגיב ללחיצה ארוכה יותר. בנוסף, ה-`LongClickListener` דורש החזרה של ערך בוליאני (`true` אם האירוע טופל).
3.  **איך משפיעים על מיקום של טקסט בתוך `TextView`?**
    - השתמשתי ב-`android:textAlignment="center"` כדי למרכז את הטקסט בתוך ה-View.
