# jenkins-multibranch-pipeline-library-demo

`Learning Resources for DevOps, SRE, Cloud & Engineering Management`

[![BINPIPE](https://img.shields.io/badge/BINPIPE-YouTube-red)](https://www.youtube.com/channel/UCPTgt4Wo0MAnuzNEEZlk90A)
[![Learn DevOps!](https://img.shields.io/badge/BINPIPE-Learn--DevOps-orange)](https://github.com/BINPIPE/resources/blob/master/devops-lesson-plans.md)
[![BINPIPE](https://img.shields.io/badge/Live--Classroom-blue)](https://forms.gle/tDJxDyj2nJyfsgsk7)
---

Demonstrates how to use a Shared Library in Jenkins pipelines. This repository defines a single function, `sayHello`, which will echo a greeting.

You can find a detailed post here - (https://www.binpipe.org/2019/09/jenkins-common-pipeline-library.html)

## Setup instructions

1. In Jenkins, go to Manage Jenkins &rarr; Configure System. Under _Global Pipeline Libraries_, add a library with the following settings:

    - Name: `jenkins-multibranch-pipeline-library-demo`
    - Default version: Specify a Git reference (branch or commit SHA), e.g. `master`
    - Retrieval method: _Modern SCM_
    - Select the _Git_ type
    - Project repository: `https://github.com/prasanjit-/jenkins-multibranch-pipeline-library-demo.git`
    - Credentials: (leave blank)

2. Then create a Jenkins job with the following pipeline (note that the underscore `_` is not a typo):

    ```
    @Library('jenkins-multibranch-pipeline-library-demo')_

    stage('Demo') {

      echo 'Hello World'

      sayHello 'Tux'

    }
    ```

This will output the following from the build:

```
[Pipeline] stage
[Pipeline] { (Demo)
[Pipeline] echo
Hello world
[Pipeline] echo
Hello, Tux.
[Pipeline] }
[Pipeline] // stage
[Pipeline] End of Pipeline
Finished: SUCCESS
```
<pre>
<a href="https://www.binpipe.org">BINPIPE</a> aims to simplify learning for those who are looking to make a foothold in the industry. 
Write to me at <b>nixgurus@gmail.com</b> if you are looking for tailor-made training sessions. 
For self-study resources look around in this repository, <a href="https://www.binpipe.org/">the Binpipe Blog</a> and <a href="https://www.youtube.com/channel/UCPTgt4Wo0MAnuzNEEZlk90A">Youtube Channel</a>.
</pre>

___
:ledger: Maintainer: **[Prasanjit Singh](https://www.linkedin.com/in/prasanjit-singh)** | **www.binpipe.org**
___

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

