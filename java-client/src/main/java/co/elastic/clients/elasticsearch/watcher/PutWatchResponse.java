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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.watcher;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.put_watch.Response
@JsonpDeserializable
public class PutWatchResponse implements JsonpSerializable {
	private final boolean created;

	private final String id;

	private final long primaryTerm;

	private final long seqNo;

	private final long version;

	// ---------------------------------------------------------------------------------------------

	private PutWatchResponse(Builder builder) {

		this.created = ModelTypeHelper.requireNonNull(builder.created, this, "created");
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.primaryTerm = ModelTypeHelper.requireNonNull(builder.primaryTerm, this, "primaryTerm");
		this.seqNo = ModelTypeHelper.requireNonNull(builder.seqNo, this, "seqNo");
		this.version = ModelTypeHelper.requireNonNull(builder.version, this, "version");

	}

	public static PutWatchResponse of(Function<Builder, ObjectBuilder<PutWatchResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code created}
	 */
	public final boolean created() {
		return this.created;
	}

	/**
	 * Required - API name: {@code _id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code _primary_term}
	 */
	public final long primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * Required - API name: {@code _seq_no}
	 */
	public final long seqNo() {
		return this.seqNo;
	}

	/**
	 * Required - API name: {@code _version}
	 */
	public final long version() {
		return this.version;
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

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("_id");
		generator.write(this.id);

		generator.writeKey("_primary_term");
		generator.write(this.primaryTerm);

		generator.writeKey("_seq_no");
		generator.write(this.seqNo);

		generator.writeKey("_version");
		generator.write(this.version);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutWatchResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutWatchResponse> {
		private Boolean created;

		private String id;

		private Long primaryTerm;

		private Long seqNo;

		private Long version;

		/**
		 * Required - API name: {@code created}
		 */
		public final Builder created(boolean value) {
			this.created = value;
			return this;
		}

		/**
		 * Required - API name: {@code _id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Required - API name: {@code _primary_term}
		 */
		public final Builder primaryTerm(long value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * Required - API name: {@code _seq_no}
		 */
		public final Builder seqNo(long value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * Required - API name: {@code _version}
		 */
		public final Builder version(long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link PutWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutWatchResponse build() {
			_checkSingleUse();

			return new PutWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutWatchResponse}
	 */
	public static final JsonpDeserializer<PutWatchResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PutWatchResponse::setupPutWatchResponseDeserializer, Builder::build);

	protected static void setupPutWatchResponseDeserializer(DelegatingDeserializer<PutWatchResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::primaryTerm, JsonpDeserializer.longDeserializer(), "_primary_term");
		op.add(Builder::seqNo, JsonpDeserializer.longDeserializer(), "_seq_no");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
