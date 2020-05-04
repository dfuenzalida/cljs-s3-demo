# ClojureScript and AWS SDK for Node example

This is a basic example of how to use the AWS SDK for Node from ClojureScript, with shadow-cljs. This project will load your credentials and list your S3 bucket info in the console.

Project based on the [Node.js example for shadow-cljs](https://github.com/minimal-xyz/minimal-shadow-cljs-nodejs).

----

### Requisites

On the AWS console, create new access keys for an user (existing or new) that has read access to your S3 buckets.

Save the credentials in your `~/.aws/credentials` file under an `example-profile` profile, like this:

```
[example-profile]
aws_access_key_id = AAAAAAAAAAAAAAAAAAAAAAAA
aws_secret_access_key = BBBBBBBBBBBBBBBBBBBB
```

### Develop

Watch compile with with hot reloading:

```bash
yarn
yarn shadow-cljs watch app
```

Start the program:

```bash
node target/main.js
```

### REPL

Start a REPL connected to current running program, `app` for the `:build-id`:

```bash
yarn shadow-cljs cljs-repl app
```

### Build

```bash
shadow-cljs release app
```

Compiles to `target/main.js`.

You may find more configurations on http://doc.shadow-cljs.org/ .

### Steps

* add `shadow-cljs.edn` to config compilation
* compile ClojureScript
* run `node target/main.js` to start app and connect reload server

### License

MIT
