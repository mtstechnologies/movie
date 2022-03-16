import { ReactComponent as GithubIcon } from "assets/img/github.svg";
import './styles.css';

function Navbar() {
  return (
    <header>
      <nav className="container">
        <div className="mtsmovie-nav-content">
          <h1>MTSMovie</h1>
          <a href="https://github.com/mtstechnologies">
            <div className="mtsmovie-contact-container">
              <GithubIcon />
              <p className="mtsmovie-contact-link">/mtstechnologies </p>
            </div>
          </a>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
