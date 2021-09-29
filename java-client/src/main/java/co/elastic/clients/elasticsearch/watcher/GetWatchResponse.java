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
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.get_watch.Response
@JsonpDeserializable
public final class GetWatchResponse implements JsonpSerializable {
	private final boolean found;

	private final String id;

	@Nullable
	private final WatchStatus status;

	@Nullable
	private final Watch watch;

	@Nullable
	private final Integer primaryTerm;

	@Nullable
	private final Integer seqNo;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	public GetWatchResponse(Builder builder) {

		this.found = Objects.requireNonNull(builder.found, "found");
		this.id = Objects.requireNonNull(builder.id, "_id");
		this.status = builder.status;
		this.watch = builder.watch;
		this.primaryTerm = builder.primaryTerm;
		this.seqNo = builder.seqNo;
		this.version = builder.version;

	}

	public GetWatchResponse(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code found}
	 */
	public boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code _id}
	 */
	public String id() {
		return this.id;
	}

	/**
	 * API name: {@code status}
	 */
	@Nullable
	public WatchStatus status() {
		return this.status;
	}

	/**
	 * API name: {@code watch}
	 */
	@Nullable
	public Watch watch() {
		return this.watch;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	@Nullable
	public Integer primaryTerm() {
		return this.primaryTerm;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Integer seqNo() {
		return this.seqNo;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public Long version() {
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

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this.id);

		if (this.status != null) {

			generator.writeKey("status");
			this.status.serialize(generator, mapper);

		}
		if (this.watch != null) {

			generator.writeKey("watch");
			this.watch.serialize(generator, mapper);

		}
		if (this.primaryTerm != null) {

			generator.writeKey("_primary_term");
			generator.write(this.primaryTerm);

		}
		if (this.seqNo != null) {

			generator.writeKey("_seq_no");
			generator.write(this.seqNo);

		}
		if (this.version != null) {

			generator.writeKey("_version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetWatchResponse> {
		private Boolean found;

		private String id;

		@Nullable
		private WatchStatus status;

		@Nullable
		private Watch watch;

		@Nullable
		private Integer primaryTerm;

		@Nullable
		private Integer seqNo;

		@Nullable
		private Long version;

		/**
		 * API name: {@code found}
		 */
		public Builder found(boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(@Nullable WatchStatus value) {
			this.status = value;
			return this;
		}

		/**
		 * API name: {@code status}
		 */
		public Builder status(Function<WatchStatus.Builder, ObjectBuilder<WatchStatus>> fn) {
			return this.status(fn.apply(new WatchStatus.Builder()).build());
		}

		/**
		 * API name: {@code watch}
		 */
		public Builder watch(@Nullable Watch value) {
			this.watch = value;
			return this;
		}

		/**
		 * API name: {@code watch}
		 */
		public Builder watch(Function<Watch.Builder, ObjectBuilder<Watch>> fn) {
			return this.watch(fn.apply(new Watch.Builder()).build());
		}

		/**
		 * API name: {@code _primary_term}
		 */
		public Builder primaryTerm(@Nullable Integer value) {
			this.primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder seqNo(@Nullable Integer value) {
			this.seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link GetWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetWatchResponse build() {

			return new GetWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetWatchResponse}
	 */
	public static final JsonpDeserializer<GetWatchResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			GetWatchResponse::setupGetWatchResponseDeserializer, Builder::build);

	protected static void setupGetWatchResponseDeserializer(DelegatingDeserializer<GetWatchResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::status, WatchStatus._DESERIALIZER, "status");
		op.add(Builder::watch, Watch._DESERIALIZER, "watch");
		op.add(Builder::primaryTerm, JsonpDeserializer.integerDeserializer(), "_primary_term");
		op.add(Builder::seqNo, JsonpDeserializer.integerDeserializer(), "_seq_no");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "_version");

	}

}
