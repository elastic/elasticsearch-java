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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
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

// typedef: nodes._types.RequestCounts

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.RequestCounts">API
 *      specification</a>
 */
@JsonpDeserializable
public class RequestCounts implements JsonpSerializable {
	@Nullable
	private final Long getblobproperties;

	@Nullable
	private final Long getblob;

	@Nullable
	private final Long listblobs;

	@Nullable
	private final Long putblob;

	@Nullable
	private final Long putblock;

	@Nullable
	private final Long putblocklist;

	@Nullable
	private final Long getobject;

	@Nullable
	private final Long listobjects;

	@Nullable
	private final Long insertobject;

	@Nullable
	private final Long putobject;

	@Nullable
	private final Long putmultipartobject;

	// ---------------------------------------------------------------------------------------------

	private RequestCounts(Builder builder) {

		this.getblobproperties = builder.getblobproperties;
		this.getblob = builder.getblob;
		this.listblobs = builder.listblobs;
		this.putblob = builder.putblob;
		this.putblock = builder.putblock;
		this.putblocklist = builder.putblocklist;
		this.getobject = builder.getobject;
		this.listobjects = builder.listobjects;
		this.insertobject = builder.insertobject;
		this.putobject = builder.putobject;
		this.putmultipartobject = builder.putmultipartobject;

	}

	public static RequestCounts of(Function<Builder, ObjectBuilder<RequestCounts>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Number of Get Blob Properties requests (Azure)
	 * <p>
	 * API name: {@code GetBlobProperties}
	 */
	@Nullable
	public final Long getblobproperties() {
		return this.getblobproperties;
	}

	/**
	 * Number of Get Blob requests (Azure)
	 * <p>
	 * API name: {@code GetBlob}
	 */
	@Nullable
	public final Long getblob() {
		return this.getblob;
	}

	/**
	 * Number of List Blobs requests (Azure)
	 * <p>
	 * API name: {@code ListBlobs}
	 */
	@Nullable
	public final Long listblobs() {
		return this.listblobs;
	}

	/**
	 * Number of Put Blob requests (Azure)
	 * <p>
	 * API name: {@code PutBlob}
	 */
	@Nullable
	public final Long putblob() {
		return this.putblob;
	}

	/**
	 * Number of Put Block (Azure)
	 * <p>
	 * API name: {@code PutBlock}
	 */
	@Nullable
	public final Long putblock() {
		return this.putblock;
	}

	/**
	 * Number of Put Block List requests
	 * <p>
	 * API name: {@code PutBlockList}
	 */
	@Nullable
	public final Long putblocklist() {
		return this.putblocklist;
	}

	/**
	 * Number of get object requests (GCP, S3)
	 * <p>
	 * API name: {@code GetObject}
	 */
	@Nullable
	public final Long getobject() {
		return this.getobject;
	}

	/**
	 * Number of list objects requests (GCP, S3)
	 * <p>
	 * API name: {@code ListObjects}
	 */
	@Nullable
	public final Long listobjects() {
		return this.listobjects;
	}

	/**
	 * Number of insert object requests, including simple, multipart and resumable
	 * uploads. Resumable uploads can perform multiple http requests to insert a
	 * single object but they are considered as a single request since they are
	 * billed as an individual operation. (GCP)
	 * <p>
	 * API name: {@code InsertObject}
	 */
	@Nullable
	public final Long insertobject() {
		return this.insertobject;
	}

	/**
	 * Number of PutObject requests (S3)
	 * <p>
	 * API name: {@code PutObject}
	 */
	@Nullable
	public final Long putobject() {
		return this.putobject;
	}

	/**
	 * Number of Multipart requests, including CreateMultipartUpload, UploadPart and
	 * CompleteMultipartUpload requests (S3)
	 * <p>
	 * API name: {@code PutMultipartObject}
	 */
	@Nullable
	public final Long putmultipartobject() {
		return this.putmultipartobject;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.getblobproperties != null) {
			generator.writeKey("GetBlobProperties");
			generator.write(this.getblobproperties);

		}
		if (this.getblob != null) {
			generator.writeKey("GetBlob");
			generator.write(this.getblob);

		}
		if (this.listblobs != null) {
			generator.writeKey("ListBlobs");
			generator.write(this.listblobs);

		}
		if (this.putblob != null) {
			generator.writeKey("PutBlob");
			generator.write(this.putblob);

		}
		if (this.putblock != null) {
			generator.writeKey("PutBlock");
			generator.write(this.putblock);

		}
		if (this.putblocklist != null) {
			generator.writeKey("PutBlockList");
			generator.write(this.putblocklist);

		}
		if (this.getobject != null) {
			generator.writeKey("GetObject");
			generator.write(this.getobject);

		}
		if (this.listobjects != null) {
			generator.writeKey("ListObjects");
			generator.write(this.listobjects);

		}
		if (this.insertobject != null) {
			generator.writeKey("InsertObject");
			generator.write(this.insertobject);

		}
		if (this.putobject != null) {
			generator.writeKey("PutObject");
			generator.write(this.putobject);

		}
		if (this.putmultipartobject != null) {
			generator.writeKey("PutMultipartObject");
			generator.write(this.putmultipartobject);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RequestCounts}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RequestCounts> {
		@Nullable
		private Long getblobproperties;

		@Nullable
		private Long getblob;

		@Nullable
		private Long listblobs;

		@Nullable
		private Long putblob;

		@Nullable
		private Long putblock;

		@Nullable
		private Long putblocklist;

		@Nullable
		private Long getobject;

		@Nullable
		private Long listobjects;

		@Nullable
		private Long insertobject;

		@Nullable
		private Long putobject;

		@Nullable
		private Long putmultipartobject;

		/**
		 * Number of Get Blob Properties requests (Azure)
		 * <p>
		 * API name: {@code GetBlobProperties}
		 */
		public final Builder getblobproperties(@Nullable Long value) {
			this.getblobproperties = value;
			return this;
		}

		/**
		 * Number of Get Blob requests (Azure)
		 * <p>
		 * API name: {@code GetBlob}
		 */
		public final Builder getblob(@Nullable Long value) {
			this.getblob = value;
			return this;
		}

		/**
		 * Number of List Blobs requests (Azure)
		 * <p>
		 * API name: {@code ListBlobs}
		 */
		public final Builder listblobs(@Nullable Long value) {
			this.listblobs = value;
			return this;
		}

		/**
		 * Number of Put Blob requests (Azure)
		 * <p>
		 * API name: {@code PutBlob}
		 */
		public final Builder putblob(@Nullable Long value) {
			this.putblob = value;
			return this;
		}

		/**
		 * Number of Put Block (Azure)
		 * <p>
		 * API name: {@code PutBlock}
		 */
		public final Builder putblock(@Nullable Long value) {
			this.putblock = value;
			return this;
		}

		/**
		 * Number of Put Block List requests
		 * <p>
		 * API name: {@code PutBlockList}
		 */
		public final Builder putblocklist(@Nullable Long value) {
			this.putblocklist = value;
			return this;
		}

		/**
		 * Number of get object requests (GCP, S3)
		 * <p>
		 * API name: {@code GetObject}
		 */
		public final Builder getobject(@Nullable Long value) {
			this.getobject = value;
			return this;
		}

		/**
		 * Number of list objects requests (GCP, S3)
		 * <p>
		 * API name: {@code ListObjects}
		 */
		public final Builder listobjects(@Nullable Long value) {
			this.listobjects = value;
			return this;
		}

		/**
		 * Number of insert object requests, including simple, multipart and resumable
		 * uploads. Resumable uploads can perform multiple http requests to insert a
		 * single object but they are considered as a single request since they are
		 * billed as an individual operation. (GCP)
		 * <p>
		 * API name: {@code InsertObject}
		 */
		public final Builder insertobject(@Nullable Long value) {
			this.insertobject = value;
			return this;
		}

		/**
		 * Number of PutObject requests (S3)
		 * <p>
		 * API name: {@code PutObject}
		 */
		public final Builder putobject(@Nullable Long value) {
			this.putobject = value;
			return this;
		}

		/**
		 * Number of Multipart requests, including CreateMultipartUpload, UploadPart and
		 * CompleteMultipartUpload requests (S3)
		 * <p>
		 * API name: {@code PutMultipartObject}
		 */
		public final Builder putmultipartobject(@Nullable Long value) {
			this.putmultipartobject = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RequestCounts}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RequestCounts build() {
			_checkSingleUse();

			return new RequestCounts(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RequestCounts}
	 */
	public static final JsonpDeserializer<RequestCounts> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RequestCounts::setupRequestCountsDeserializer);

	protected static void setupRequestCountsDeserializer(ObjectDeserializer<RequestCounts.Builder> op) {

		op.add(Builder::getblobproperties, JsonpDeserializer.longDeserializer(), "GetBlobProperties");
		op.add(Builder::getblob, JsonpDeserializer.longDeserializer(), "GetBlob");
		op.add(Builder::listblobs, JsonpDeserializer.longDeserializer(), "ListBlobs");
		op.add(Builder::putblob, JsonpDeserializer.longDeserializer(), "PutBlob");
		op.add(Builder::putblock, JsonpDeserializer.longDeserializer(), "PutBlock");
		op.add(Builder::putblocklist, JsonpDeserializer.longDeserializer(), "PutBlockList");
		op.add(Builder::getobject, JsonpDeserializer.longDeserializer(), "GetObject");
		op.add(Builder::listobjects, JsonpDeserializer.longDeserializer(), "ListObjects");
		op.add(Builder::insertobject, JsonpDeserializer.longDeserializer(), "InsertObject");
		op.add(Builder::putobject, JsonpDeserializer.longDeserializer(), "PutObject");
		op.add(Builder::putmultipartobject, JsonpDeserializer.longDeserializer(), "PutMultipartObject");

	}

}
