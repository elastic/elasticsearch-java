/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.elasticsearch.snapshot;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: snapshot._types.S3RepositorySettings

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#snapshot._types.S3RepositorySettings">API
 *      specification</a>
 */
@JsonpDeserializable
public class S3RepositorySettings extends RepositorySettingsBase {
	private final String bucket;

	@Nullable
	private final String basePath;

	@Nullable
	private final String bufferSize;

	@Nullable
	private final String cannedAcl;

	@Nullable
	private final String client;

	@Nullable
	private final Integer deleteObjectsMaxSize;

	@Nullable
	private final Time getRegisterRetryDelay;

	@Nullable
	private final Integer maxMultipartParts;

	@Nullable
	private final Integer maxMultipartUploadCleanupSize;

	@Nullable
	private final Boolean readonly;

	@Nullable
	private final Boolean serverSideEncryption;

	@Nullable
	private final String storageClass;

	@Nullable
	private final Time throttledDeleteRetryDelayIncrement;

	@Nullable
	private final Time throttledDeleteRetryMaximumDelay;

	@Nullable
	private final Integer throttledDeleteRetryMaximumNumberOfRetries;

	// ---------------------------------------------------------------------------------------------

	private S3RepositorySettings(Builder builder) {
		super(builder);

		this.bucket = ApiTypeHelper.requireNonNull(builder.bucket, this, "bucket");
		this.basePath = builder.basePath;
		this.bufferSize = builder.bufferSize;
		this.cannedAcl = builder.cannedAcl;
		this.client = builder.client;
		this.deleteObjectsMaxSize = builder.deleteObjectsMaxSize;
		this.getRegisterRetryDelay = builder.getRegisterRetryDelay;
		this.maxMultipartParts = builder.maxMultipartParts;
		this.maxMultipartUploadCleanupSize = builder.maxMultipartUploadCleanupSize;
		this.readonly = builder.readonly;
		this.serverSideEncryption = builder.serverSideEncryption;
		this.storageClass = builder.storageClass;
		this.throttledDeleteRetryDelayIncrement = builder.throttledDeleteRetryDelayIncrement;
		this.throttledDeleteRetryMaximumDelay = builder.throttledDeleteRetryMaximumDelay;
		this.throttledDeleteRetryMaximumNumberOfRetries = builder.throttledDeleteRetryMaximumNumberOfRetries;

	}

	public static S3RepositorySettings of(Function<Builder, ObjectBuilder<S3RepositorySettings>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the S3 bucket to use for snapshots. The bucket name
	 * must adhere to Amazon's S3 bucket naming rules.
	 * <p>
	 * API name: {@code bucket}
	 */
	public final String bucket() {
		return this.bucket;
	}

	/**
	 * The path to the repository data within its bucket. It defaults to an empty
	 * string, meaning that the repository is at the root of the bucket. The value
	 * of this setting should not start or end with a forward slash
	 * (<code>/</code>).
	 * <p>
	 * NOTE: Don't set base_path when configuring a snapshot repository for Elastic
	 * Cloud Enterprise. Elastic Cloud Enterprise automatically generates the
	 * <code>base_path</code> for each deployment so that multiple deployments may
	 * share the same bucket.
	 * <p>
	 * API name: {@code base_path}
	 */
	@Nullable
	public final String basePath() {
		return this.basePath;
	}

	/**
	 * The minimum threshold below which the chunk is uploaded using a single
	 * request. Beyond this threshold, the S3 repository will use the AWS Multipart
	 * Upload API to split the chunk into several parts, each of
	 * <code>buffer_size</code> length, and to upload each part in its own request.
	 * Note that setting a buffer size lower than 5mb is not allowed since it will
	 * prevent the use of the Multipart API and may result in upload errors. It is
	 * also not possible to set a buffer size greater than 5gb as it is the maximum
	 * upload size allowed by S3. Defaults to <code>100mb</code> or 5% of JVM heap,
	 * whichever is smaller.
	 * <p>
	 * API name: {@code buffer_size}
	 */
	@Nullable
	public final String bufferSize() {
		return this.bufferSize;
	}

	/**
	 * The S3 repository supports all S3 canned ACLs: <code>private</code>,
	 * <code>public-read</code>, <code>public-read-write</code>,
	 * <code>authenticated-read</code>, <code>log-delivery-write</code>,
	 * <code>bucket-owner-read</code>, <code>bucket-owner-full-control</code>. You
	 * could specify a canned ACL using the <code>canned_acl</code> setting. When
	 * the S3 repository creates buckets and objects, it adds the canned ACL into
	 * the buckets and objects.
	 * <p>
	 * API name: {@code canned_acl}
	 */
	@Nullable
	public final String cannedAcl() {
		return this.cannedAcl;
	}

	/**
	 * The name of the S3 client to use to connect to S3.
	 * <p>
	 * API name: {@code client}
	 */
	@Nullable
	public final String client() {
		return this.client;
	}

	/**
	 * The maxmimum batch size, between 1 and 1000, used for
	 * <code>DeleteObjects</code> requests. Defaults to 1000 which is the maximum
	 * number supported by the AWS DeleteObjects API.
	 * <p>
	 * API name: {@code delete_objects_max_size}
	 */
	@Nullable
	public final Integer deleteObjectsMaxSize() {
		return this.deleteObjectsMaxSize;
	}

	/**
	 * The time to wait before trying again if an attempt to read a linearizable
	 * register fails.
	 * <p>
	 * API name: {@code get_register_retry_delay}
	 */
	@Nullable
	public final Time getRegisterRetryDelay() {
		return this.getRegisterRetryDelay;
	}

	/**
	 * The maximum number of parts that Elasticsearch will write during a multipart
	 * upload of a single object. Files which are larger than
	 * <code>buffer_size × max_multipart_parts</code> will be chunked into several
	 * smaller objects. Elasticsearch may also split a file across multiple objects
	 * to satisfy other constraints such as the <code>chunk_size</code> limit.
	 * Defaults to <code>10000</code> which is the maximum number of parts in a
	 * multipart upload in AWS S3.
	 * <p>
	 * API name: {@code max_multipart_parts}
	 */
	@Nullable
	public final Integer maxMultipartParts() {
		return this.maxMultipartParts;
	}

	/**
	 * The maximum number of possibly-dangling multipart uploads to clean up in each
	 * batch of snapshot deletions. Defaults to 1000 which is the maximum number
	 * supported by the AWS ListMultipartUploads API. If set to <code>0</code>,
	 * Elasticsearch will not attempt to clean up dangling multipart uploads.
	 * <p>
	 * API name: {@code max_multipart_upload_cleanup_size}
	 */
	@Nullable
	public final Integer maxMultipartUploadCleanupSize() {
		return this.maxMultipartUploadCleanupSize;
	}

	/**
	 * If true, the repository is read-only. The cluster can retrieve and restore
	 * snapshots from the repository but not write to the repository or create
	 * snapshots in it.
	 * <p>
	 * Only a cluster with write access can create snapshots in the repository. All
	 * other clusters connected to the repository should have the
	 * <code>readonly</code> parameter set to <code>true</code>.
	 * <p>
	 * If <code>false</code>, the cluster can write to the repository and create
	 * snapshots in it.
	 * <p>
	 * IMPORTANT: If you register the same snapshot repository with multiple
	 * clusters, only one cluster should have write access to the repository. Having
	 * multiple clusters write to the repository at the same time risks corrupting
	 * the contents of the repository.
	 * <p>
	 * API name: {@code readonly}
	 */
	@Nullable
	public final Boolean readonly() {
		return this.readonly;
	}

	/**
	 * When set to <code>true</code>, files are encrypted on server side using an
	 * AES256 algorithm.
	 * <p>
	 * API name: {@code server_side_encryption}
	 */
	@Nullable
	public final Boolean serverSideEncryption() {
		return this.serverSideEncryption;
	}

	/**
	 * The S3 storage class for objects written to the repository. Values may be
	 * <code>standard</code>, <code>reduced_redundancy</code>,
	 * <code>standard_ia</code>, <code>onezone_ia</code>, and
	 * <code>intelligent_tiering</code>.
	 * <p>
	 * API name: {@code storage_class}
	 */
	@Nullable
	public final String storageClass() {
		return this.storageClass;
	}

	/**
	 * The delay before the first retry and the amount the delay is incremented by
	 * on each subsequent retry. The default is 50ms and the minimum is 0ms.
	 * <p>
	 * API name: {@code throttled_delete_retry.delay_increment}
	 */
	@Nullable
	public final Time throttledDeleteRetryDelayIncrement() {
		return this.throttledDeleteRetryDelayIncrement;
	}

	/**
	 * The upper bound on how long the delays between retries will grow to. The
	 * default is 5s and the minimum is 0ms.
	 * <p>
	 * API name: {@code throttled_delete_retry.maximum_delay}
	 */
	@Nullable
	public final Time throttledDeleteRetryMaximumDelay() {
		return this.throttledDeleteRetryMaximumDelay;
	}

	/**
	 * The number times to retry a throttled snapshot deletion. The default is 10
	 * and the minimum value is 0 which will disable retries altogether. Note that
	 * if retries are enabled in the Azure client, each of these retries comprises
	 * that many client-level retries.
	 * <p>
	 * API name: {@code throttled_delete_retry.maximum_number_of_retries}
	 */
	@Nullable
	public final Integer throttledDeleteRetryMaximumNumberOfRetries() {
		return this.throttledDeleteRetryMaximumNumberOfRetries;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("bucket");
		generator.write(this.bucket);

		if (this.basePath != null) {
			generator.writeKey("base_path");
			generator.write(this.basePath);

		}
		if (this.bufferSize != null) {
			generator.writeKey("buffer_size");
			generator.write(this.bufferSize);

		}
		if (this.cannedAcl != null) {
			generator.writeKey("canned_acl");
			generator.write(this.cannedAcl);

		}
		if (this.client != null) {
			generator.writeKey("client");
			generator.write(this.client);

		}
		if (this.deleteObjectsMaxSize != null) {
			generator.writeKey("delete_objects_max_size");
			generator.write(this.deleteObjectsMaxSize);

		}
		if (this.getRegisterRetryDelay != null) {
			generator.writeKey("get_register_retry_delay");
			this.getRegisterRetryDelay.serialize(generator, mapper);

		}
		if (this.maxMultipartParts != null) {
			generator.writeKey("max_multipart_parts");
			generator.write(this.maxMultipartParts);

		}
		if (this.maxMultipartUploadCleanupSize != null) {
			generator.writeKey("max_multipart_upload_cleanup_size");
			generator.write(this.maxMultipartUploadCleanupSize);

		}
		if (this.readonly != null) {
			generator.writeKey("readonly");
			generator.write(this.readonly);

		}
		if (this.serverSideEncryption != null) {
			generator.writeKey("server_side_encryption");
			generator.write(this.serverSideEncryption);

		}
		if (this.storageClass != null) {
			generator.writeKey("storage_class");
			generator.write(this.storageClass);

		}
		if (this.throttledDeleteRetryDelayIncrement != null) {
			generator.writeKey("throttled_delete_retry.delay_increment");
			this.throttledDeleteRetryDelayIncrement.serialize(generator, mapper);

		}
		if (this.throttledDeleteRetryMaximumDelay != null) {
			generator.writeKey("throttled_delete_retry.maximum_delay");
			this.throttledDeleteRetryMaximumDelay.serialize(generator, mapper);

		}
		if (this.throttledDeleteRetryMaximumNumberOfRetries != null) {
			generator.writeKey("throttled_delete_retry.maximum_number_of_retries");
			generator.write(this.throttledDeleteRetryMaximumNumberOfRetries);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link S3RepositorySettings}.
	 */

	public static class Builder extends RepositorySettingsBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<S3RepositorySettings> {
		private String bucket;

		@Nullable
		private String basePath;

		@Nullable
		private String bufferSize;

		@Nullable
		private String cannedAcl;

		@Nullable
		private String client;

		@Nullable
		private Integer deleteObjectsMaxSize;

		@Nullable
		private Time getRegisterRetryDelay;

		@Nullable
		private Integer maxMultipartParts;

		@Nullable
		private Integer maxMultipartUploadCleanupSize;

		@Nullable
		private Boolean readonly;

		@Nullable
		private Boolean serverSideEncryption;

		@Nullable
		private String storageClass;

		@Nullable
		private Time throttledDeleteRetryDelayIncrement;

		@Nullable
		private Time throttledDeleteRetryMaximumDelay;

		@Nullable
		private Integer throttledDeleteRetryMaximumNumberOfRetries;

		public Builder() {
		}
		private Builder(S3RepositorySettings instance) {
			this.bucket = instance.bucket;
			this.basePath = instance.basePath;
			this.bufferSize = instance.bufferSize;
			this.cannedAcl = instance.cannedAcl;
			this.client = instance.client;
			this.deleteObjectsMaxSize = instance.deleteObjectsMaxSize;
			this.getRegisterRetryDelay = instance.getRegisterRetryDelay;
			this.maxMultipartParts = instance.maxMultipartParts;
			this.maxMultipartUploadCleanupSize = instance.maxMultipartUploadCleanupSize;
			this.readonly = instance.readonly;
			this.serverSideEncryption = instance.serverSideEncryption;
			this.storageClass = instance.storageClass;
			this.throttledDeleteRetryDelayIncrement = instance.throttledDeleteRetryDelayIncrement;
			this.throttledDeleteRetryMaximumDelay = instance.throttledDeleteRetryMaximumDelay;
			this.throttledDeleteRetryMaximumNumberOfRetries = instance.throttledDeleteRetryMaximumNumberOfRetries;

		}
		/**
		 * Required - The name of the S3 bucket to use for snapshots. The bucket name
		 * must adhere to Amazon's S3 bucket naming rules.
		 * <p>
		 * API name: {@code bucket}
		 */
		public final Builder bucket(String value) {
			this.bucket = value;
			return this;
		}

		/**
		 * The path to the repository data within its bucket. It defaults to an empty
		 * string, meaning that the repository is at the root of the bucket. The value
		 * of this setting should not start or end with a forward slash
		 * (<code>/</code>).
		 * <p>
		 * NOTE: Don't set base_path when configuring a snapshot repository for Elastic
		 * Cloud Enterprise. Elastic Cloud Enterprise automatically generates the
		 * <code>base_path</code> for each deployment so that multiple deployments may
		 * share the same bucket.
		 * <p>
		 * API name: {@code base_path}
		 */
		public final Builder basePath(@Nullable String value) {
			this.basePath = value;
			return this;
		}

		/**
		 * The minimum threshold below which the chunk is uploaded using a single
		 * request. Beyond this threshold, the S3 repository will use the AWS Multipart
		 * Upload API to split the chunk into several parts, each of
		 * <code>buffer_size</code> length, and to upload each part in its own request.
		 * Note that setting a buffer size lower than 5mb is not allowed since it will
		 * prevent the use of the Multipart API and may result in upload errors. It is
		 * also not possible to set a buffer size greater than 5gb as it is the maximum
		 * upload size allowed by S3. Defaults to <code>100mb</code> or 5% of JVM heap,
		 * whichever is smaller.
		 * <p>
		 * API name: {@code buffer_size}
		 */
		public final Builder bufferSize(@Nullable String value) {
			this.bufferSize = value;
			return this;
		}

		/**
		 * The S3 repository supports all S3 canned ACLs: <code>private</code>,
		 * <code>public-read</code>, <code>public-read-write</code>,
		 * <code>authenticated-read</code>, <code>log-delivery-write</code>,
		 * <code>bucket-owner-read</code>, <code>bucket-owner-full-control</code>. You
		 * could specify a canned ACL using the <code>canned_acl</code> setting. When
		 * the S3 repository creates buckets and objects, it adds the canned ACL into
		 * the buckets and objects.
		 * <p>
		 * API name: {@code canned_acl}
		 */
		public final Builder cannedAcl(@Nullable String value) {
			this.cannedAcl = value;
			return this;
		}

		/**
		 * The name of the S3 client to use to connect to S3.
		 * <p>
		 * API name: {@code client}
		 */
		public final Builder client(@Nullable String value) {
			this.client = value;
			return this;
		}

		/**
		 * The maxmimum batch size, between 1 and 1000, used for
		 * <code>DeleteObjects</code> requests. Defaults to 1000 which is the maximum
		 * number supported by the AWS DeleteObjects API.
		 * <p>
		 * API name: {@code delete_objects_max_size}
		 */
		public final Builder deleteObjectsMaxSize(@Nullable Integer value) {
			this.deleteObjectsMaxSize = value;
			return this;
		}

		/**
		 * The time to wait before trying again if an attempt to read a linearizable
		 * register fails.
		 * <p>
		 * API name: {@code get_register_retry_delay}
		 */
		public final Builder getRegisterRetryDelay(@Nullable Time value) {
			this.getRegisterRetryDelay = value;
			return this;
		}

		/**
		 * The time to wait before trying again if an attempt to read a linearizable
		 * register fails.
		 * <p>
		 * API name: {@code get_register_retry_delay}
		 */
		public final Builder getRegisterRetryDelay(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.getRegisterRetryDelay(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The maximum number of parts that Elasticsearch will write during a multipart
		 * upload of a single object. Files which are larger than
		 * <code>buffer_size × max_multipart_parts</code> will be chunked into several
		 * smaller objects. Elasticsearch may also split a file across multiple objects
		 * to satisfy other constraints such as the <code>chunk_size</code> limit.
		 * Defaults to <code>10000</code> which is the maximum number of parts in a
		 * multipart upload in AWS S3.
		 * <p>
		 * API name: {@code max_multipart_parts}
		 */
		public final Builder maxMultipartParts(@Nullable Integer value) {
			this.maxMultipartParts = value;
			return this;
		}

		/**
		 * The maximum number of possibly-dangling multipart uploads to clean up in each
		 * batch of snapshot deletions. Defaults to 1000 which is the maximum number
		 * supported by the AWS ListMultipartUploads API. If set to <code>0</code>,
		 * Elasticsearch will not attempt to clean up dangling multipart uploads.
		 * <p>
		 * API name: {@code max_multipart_upload_cleanup_size}
		 */
		public final Builder maxMultipartUploadCleanupSize(@Nullable Integer value) {
			this.maxMultipartUploadCleanupSize = value;
			return this;
		}

		/**
		 * If true, the repository is read-only. The cluster can retrieve and restore
		 * snapshots from the repository but not write to the repository or create
		 * snapshots in it.
		 * <p>
		 * Only a cluster with write access can create snapshots in the repository. All
		 * other clusters connected to the repository should have the
		 * <code>readonly</code> parameter set to <code>true</code>.
		 * <p>
		 * If <code>false</code>, the cluster can write to the repository and create
		 * snapshots in it.
		 * <p>
		 * IMPORTANT: If you register the same snapshot repository with multiple
		 * clusters, only one cluster should have write access to the repository. Having
		 * multiple clusters write to the repository at the same time risks corrupting
		 * the contents of the repository.
		 * <p>
		 * API name: {@code readonly}
		 */
		public final Builder readonly(@Nullable Boolean value) {
			this.readonly = value;
			return this;
		}

		/**
		 * When set to <code>true</code>, files are encrypted on server side using an
		 * AES256 algorithm.
		 * <p>
		 * API name: {@code server_side_encryption}
		 */
		public final Builder serverSideEncryption(@Nullable Boolean value) {
			this.serverSideEncryption = value;
			return this;
		}

		/**
		 * The S3 storage class for objects written to the repository. Values may be
		 * <code>standard</code>, <code>reduced_redundancy</code>,
		 * <code>standard_ia</code>, <code>onezone_ia</code>, and
		 * <code>intelligent_tiering</code>.
		 * <p>
		 * API name: {@code storage_class}
		 */
		public final Builder storageClass(@Nullable String value) {
			this.storageClass = value;
			return this;
		}

		/**
		 * The delay before the first retry and the amount the delay is incremented by
		 * on each subsequent retry. The default is 50ms and the minimum is 0ms.
		 * <p>
		 * API name: {@code throttled_delete_retry.delay_increment}
		 */
		public final Builder throttledDeleteRetryDelayIncrement(@Nullable Time value) {
			this.throttledDeleteRetryDelayIncrement = value;
			return this;
		}

		/**
		 * The delay before the first retry and the amount the delay is incremented by
		 * on each subsequent retry. The default is 50ms and the minimum is 0ms.
		 * <p>
		 * API name: {@code throttled_delete_retry.delay_increment}
		 */
		public final Builder throttledDeleteRetryDelayIncrement(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttledDeleteRetryDelayIncrement(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The upper bound on how long the delays between retries will grow to. The
		 * default is 5s and the minimum is 0ms.
		 * <p>
		 * API name: {@code throttled_delete_retry.maximum_delay}
		 */
		public final Builder throttledDeleteRetryMaximumDelay(@Nullable Time value) {
			this.throttledDeleteRetryMaximumDelay = value;
			return this;
		}

		/**
		 * The upper bound on how long the delays between retries will grow to. The
		 * default is 5s and the minimum is 0ms.
		 * <p>
		 * API name: {@code throttled_delete_retry.maximum_delay}
		 */
		public final Builder throttledDeleteRetryMaximumDelay(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.throttledDeleteRetryMaximumDelay(fn.apply(new Time.Builder()).build());
		}

		/**
		 * The number times to retry a throttled snapshot deletion. The default is 10
		 * and the minimum value is 0 which will disable retries altogether. Note that
		 * if retries are enabled in the Azure client, each of these retries comprises
		 * that many client-level retries.
		 * <p>
		 * API name: {@code throttled_delete_retry.maximum_number_of_retries}
		 */
		public final Builder throttledDeleteRetryMaximumNumberOfRetries(@Nullable Integer value) {
			this.throttledDeleteRetryMaximumNumberOfRetries = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link S3RepositorySettings}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public S3RepositorySettings build() {
			_checkSingleUse();

			return new S3RepositorySettings(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link S3RepositorySettings}
	 */
	public static final JsonpDeserializer<S3RepositorySettings> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, S3RepositorySettings::setupS3RepositorySettingsDeserializer);

	protected static void setupS3RepositorySettingsDeserializer(ObjectDeserializer<S3RepositorySettings.Builder> op) {
		RepositorySettingsBase.setupRepositorySettingsBaseDeserializer(op);
		op.add(Builder::bucket, JsonpDeserializer.stringDeserializer(), "bucket");
		op.add(Builder::basePath, JsonpDeserializer.stringDeserializer(), "base_path");
		op.add(Builder::bufferSize, JsonpDeserializer.stringDeserializer(), "buffer_size");
		op.add(Builder::cannedAcl, JsonpDeserializer.stringDeserializer(), "canned_acl");
		op.add(Builder::client, JsonpDeserializer.stringDeserializer(), "client");
		op.add(Builder::deleteObjectsMaxSize, JsonpDeserializer.integerDeserializer(), "delete_objects_max_size");
		op.add(Builder::getRegisterRetryDelay, Time._DESERIALIZER, "get_register_retry_delay");
		op.add(Builder::maxMultipartParts, JsonpDeserializer.integerDeserializer(), "max_multipart_parts");
		op.add(Builder::maxMultipartUploadCleanupSize, JsonpDeserializer.integerDeserializer(),
				"max_multipart_upload_cleanup_size");
		op.add(Builder::readonly, JsonpDeserializer.booleanDeserializer(), "readonly");
		op.add(Builder::serverSideEncryption, JsonpDeserializer.booleanDeserializer(), "server_side_encryption");
		op.add(Builder::storageClass, JsonpDeserializer.stringDeserializer(), "storage_class");
		op.add(Builder::throttledDeleteRetryDelayIncrement, Time._DESERIALIZER,
				"throttled_delete_retry.delay_increment");
		op.add(Builder::throttledDeleteRetryMaximumDelay, Time._DESERIALIZER, "throttled_delete_retry.maximum_delay");
		op.add(Builder::throttledDeleteRetryMaximumNumberOfRetries, JsonpDeserializer.integerDeserializer(),
				"throttled_delete_retry.maximum_number_of_retries");

	}

}
