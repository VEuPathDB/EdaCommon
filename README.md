# EdaCommon
Contains code, API and schema documents, and any other data needed by multiple EDA web services

# docker-compose

## preliminary requirements

To bring up the eda project via docker-compose, you'll need a few things.

* a functioning docker setup, and docker-compose (TODO: links to installs)
* a functioning traefik setup.  clone the https://github.com/VEuPathDB/docker-traefik project, and run `docker-compose up -d` in the clone, or follow the instructions in that repo.  This will run traefik locally, which handles the container routing
* a functioning sshuttle setup.  If you need to access databases on internal networks, you'll need to properly setup sshuttle so that your containers can reach them.  Setting this up is out of scope for this document, to not expose unnecessary internal details publicly.

## bring up the eda project

* clone this repo, and add any required environment variables to your `.env` file. (TODO: explain what those variables do)
* `docker-compose up` in your clone of this repo.


When everything comes up successfully, you'll be able to reach services at:

https://edasubsetting-dev.local.apidb.org/
https://edadata-dev.local.apidb.org/

# notes

* all services use https, but the certs are not valid.  You will need to accept them in a browser, or use the `-k` flag with curl


