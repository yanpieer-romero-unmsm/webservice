// Call the dataTables jQuery plugin
$(document).ready(function() {
    // on ready
});

async function registrarUsuario() {
  let datos = {};

  datos.nombre = document.getElementById('txtName').value;
  datos.apellido = document.getElementById('txtLastName').value;
  datos.email = document.getElementById('txtEmail').value;
  datos.password = document.getElementById('txtPassword').value;

  let repetirPassword = document.getElementById('txtRepeatPassword').value;

  if(repetirPassword != datos.password){
    alert('The password you write is different.');
    return;
  }

  const request = await fetch('api/usuarios', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(datos)
  });
  const usuarios = await request.json();

}