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
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher.get_watch.Response
public final class GetWatchResponse implements ToJsonp {
	private final Boolean found;

	private final String _id;

	@Nullable
	private final WatchStatus status;

	@Nullable
	private final Watch watch;

	@Nullable
	private final Number _primaryTerm;

	@Nullable
	private final Number _seqNo;

	@Nullable
	private final Number _version;

	// ---------------------------------------------------------------------------------------------

	protected GetWatchResponse(Builder builder) {

		this.found = Objects.requireNonNull(builder.found, "found");
		this._id = Objects.requireNonNull(builder._id, "_id");
		this.status = builder.status;
		this.watch = builder.watch;
		this._primaryTerm = builder._primaryTerm;
		this._seqNo = builder._seqNo;
		this._version = builder._version;

	}

	/**
	 * API name: {@code found}
	 */
	public Boolean found() {
		return this.found;
	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
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
	public Number _primaryTerm() {
		return this._primaryTerm;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	@Nullable
	public Number _seqNo() {
		return this._seqNo;
	}

	/**
	 * API name: {@code _version}
	 */
	@Nullable
	public Number _version() {
		return this._version;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this._id);

		if (this.status != null) {

			generator.writeKey("status");
			this.status.toJsonp(generator, mapper);

		}
		if (this.watch != null) {

			generator.writeKey("watch");
			this.watch.toJsonp(generator, mapper);

		}
		if (this._primaryTerm != null) {

			generator.writeKey("_primary_term");
			generator.write(this._primaryTerm.doubleValue());

		}
		if (this._seqNo != null) {

			generator.writeKey("_seq_no");
			generator.write(this._seqNo.doubleValue());

		}
		if (this._version != null) {

			generator.writeKey("_version");
			generator.write(this._version.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<GetWatchResponse> {
		private Boolean found;

		private String _id;

		@Nullable
		private WatchStatus status;

		@Nullable
		private Watch watch;

		@Nullable
		private Number _primaryTerm;

		@Nullable
		private Number _seqNo;

		@Nullable
		private Number _version;

		/**
		 * API name: {@code found}
		 */
		public Builder found(Boolean value) {
			this.found = value;
			return this;
		}

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(String value) {
			this._id = value;
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
		public Builder _primaryTerm(@Nullable Number value) {
			this._primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder _seqNo(@Nullable Number value) {
			this._seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder _version(@Nullable Number value) {
			this._version = value;
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
	 * Json deserializer for GetWatchResponse
	 */
	public static final JsonpDeserializer<GetWatchResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, GetWatchResponse::setupGetWatchResponseDeserializer);

	protected static void setupGetWatchResponseDeserializer(DelegatingDeserializer<GetWatchResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::status, WatchStatus.DESERIALIZER, "status");
		op.add(Builder::watch, Watch.DESERIALIZER, "watch");
		op.add(Builder::_primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(Builder::_seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(Builder::_version, JsonpDeserializer.numberDeserializer(), "_version");

	}

}
