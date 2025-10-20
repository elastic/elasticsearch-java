# rest5-client

The Elasticsearch Java client historically used a "Low Level Rest Client" (LLRC) based on Apache http client version 4 to handle http communications and distribution of requests among the nodes of a cluster.

This directory is a port of this client to Apache http client version 5 that is mostly a drop-in replacement, except for the initialization phase.

It is provided as an independent library as a convenience to users who have an existing code based on LLRC and would like to migrate to the more modern Apache http 5 library.
