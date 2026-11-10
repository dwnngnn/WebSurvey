<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Murach's Java Servlets and JSP - Thanks</title>
  <link rel="stylesheet" href="styles/main.css">
</head>
<body>
  <header>
    <img src="logo_murach.png" alt="Murach Logo">
  </header>

  <main>
    <h1>Thanks for filling out our survey!</h1>
    <p>Here is the information that you entered:</p>

    <section>
      <h2>User</h2>
      <dl>
        <dt>First Name:</dt>    <dd>${user.firstName}</dd>
        <dt>Last Name:</dt>     <dd>${user.lastName}</dd>
        <dt>Email:</dt>         <dd>${user.email}</dd>
        <dt>Date of Birth:</dt> <dd>${user.dateOfBirth}</dd>
      </dl>
    </section>

    <section>
      <h2>Survey</h2>
      <dl>
        <dt>Heard From:</dt>          <dd>${survey.heardFrom}</dd>
        <dt>Announcements:</dt>       <dd>${survey.announcements ? 'Yes' : 'No'}</dd>
        <dt>Email Announcements:</dt> <dd>${survey.emailAnnouncements ? 'Yes' : 'No'}</dd>
        <dt>Contact Via:</dt>         <dd>${survey.contactVia}</dd>
      </dl>
    </section>

    <p><a href="index.html">Return</a></p>
  </main>
</body>
</html>