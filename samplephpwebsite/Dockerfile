FROM php:7.1-fpm
RUN apt-get update && apt-get install -y \
        libmcrypt-dev \
        libicu-dev \
        libpq-dev \
        libbz2-dev \
        php-pear \
        git \
        unzip \
        mc \
        vim \
        wget \
        libevent-dev \
        librabbitmq-dev \
    && docker-php-ext-install iconv \
    && docker-php-ext-install mcrypt \
    && docker-php-ext-install zip \
    && docker-php-ext-install bz2 \
    && docker-php-ext-install mbstring \
    && docker-php-ext-install intl \
    && docker-php-ext-install pgsql pdo pdo_pgsql \
    && docker-php-ext-install pdo_mysql \
    && docker-php-ext-install bcmath \
    && docker-php-ext-install opcache \
    && docker-php-ext-enable opcache
