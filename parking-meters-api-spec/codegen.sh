java -jar openapi-generator-cli.jar generate \
-i ./openapi.yaml \
-l spring \
-o ./codegen \
--api-package com.toblerones.parking.meters.controllers \
--group-id com.toblerones \
--artifact-id parking-meters-service \
--artifact-version 1.0.0 \
--model-package com.toblerones.parking.meters.model
