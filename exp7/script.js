const form = document.getElementById("contactForm");
const fields = {
  name: {
    input: document.getElementById("name"),
    error: document.getElementById("nameError"),
    message: "Please enter your name."
  },
  email: {
    input: document.getElementById("email"),
    error: document.getElementById("emailError"),
    message: "Please enter a valid email address."
  },
  message: {
    input: document.getElementById("message"),
    error: document.getElementById("messageError"),
    message: "Please enter a message."
  }
};
const successMessage = document.getElementById("successMessage");

function validateField(key) {
  const field = fields[key];
  const value = field.input.value.trim();
  let error = "";

  if (!value) {
    error = key === "email" ? "Please enter your email." : field.message;
  } else if (
    key === "email" &&
    !/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(value)
  ) {
    error = field.message;
  }

  field.error.textContent = error;
  field.input.closest(".field").classList.toggle("invalid", Boolean(error));
  return !error;
}

Object.keys(fields).forEach((key) => {
  fields[key].input.addEventListener("input", () => {
    validateField(key);
    successMessage.textContent = "";
  });
  fields[key].input.addEventListener("blur", () => validateField(key));
});

form.addEventListener("submit", (event) => {
  event.preventDefault();

  const valid = Object.keys(fields).map(validateField).every(Boolean);

  if (!valid) {
    successMessage.textContent = "";
    return;
  }

  successMessage.textContent = "Message sent successfully!";
  form.reset();
  Object.keys(fields).forEach((key) => {
    fields[key].input.closest(".field").classList.remove("invalid");
    fields[key].error.textContent = "";
  });
});
