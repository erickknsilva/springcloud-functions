#!/usr/bin/env zsh

cloud functions deploy spring-function \
--entrypoint com.coffeandit.springcloud_functions.SpringcloudFunctionsApplication \
--runtime java17 \
--trigger-http \
--allow-unauthenticated \
--source build/libs
--memory 256mb