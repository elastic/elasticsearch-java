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
import javax.annotation.Nullable;

// typedef: watcher.put_watch.Response
public final class PutWatchResponse implements ToJsonp {
	private final Boolean created;

	private final String _id;

	private final Number _primaryTerm;

	private final Number _seqNo;

	private final Number _version;

	// ---------------------------------------------------------------------------------------------

	protected PutWatchResponse(Builder builder) {

		this.created = Objects.requireNonNull(builder.created, "created");
		this._id = Objects.requireNonNull(builder._id, "_id");
		this._primaryTerm = Objects.requireNonNull(builder._primaryTerm, "_primary_term");
		this._seqNo = Objects.requireNonNull(builder._seqNo, "_seq_no");
		this._version = Objects.requireNonNull(builder._version, "_version");

	}

	/**
	 * API name: {@code created}
	 */
	public Boolean created() {
		return this.created;
	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _primary_term}
	 */
	public Number _primaryTerm() {
		return this._primaryTerm;
	}

	/**
	 * API name: {@code _seq_no}
	 */
	public Number _seqNo() {
		return this._seqNo;
	}

	/**
	 * API name: {@code _version}
	 */
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

		generator.writeKey("created");
		generator.write(this.created);

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_primary_term");
		generator.write(this._primaryTerm.doubleValue());

		generator.writeKey("_seq_no");
		generator.write(this._seqNo.doubleValue());

		generator.writeKey("_version");
		generator.write(this._version.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<PutWatchResponse> {
		private Boolean created;

		private String _id;

		private Number _primaryTerm;

		private Number _seqNo;

		private Number _version;

		/**
		 * API name: {@code created}
		 */
		public Builder created(Boolean value) {
			this.created = value;
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
		 * API name: {@code _primary_term}
		 */
		public Builder _primaryTerm(Number value) {
			this._primaryTerm = value;
			return this;
		}

		/**
		 * API name: {@code _seq_no}
		 */
		public Builder _seqNo(Number value) {
			this._seqNo = value;
			return this;
		}

		/**
		 * API name: {@code _version}
		 */
		public Builder _version(Number value) {
			this._version = value;
			return this;
		}

		/**
		 * Builds a {@link PutWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutWatchResponse build() {

			return new PutWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for PutWatchResponse
	 */
	public static final JsonpDeserializer<PutWatchResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, PutWatchResponse::setupPutWatchResponseDeserializer);

	protected static void setupPutWatchResponseDeserializer(DelegatingDeserializer<PutWatchResponse.Builder> op) {

		op.add(Builder::created, JsonpDeserializer.booleanDeserializer(), "created");
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_primaryTerm, JsonpDeserializer.numberDeserializer(), "_primary_term");
		op.add(Builder::_seqNo, JsonpDeserializer.numberDeserializer(), "_seq_no");
		op.add(Builder::_version, JsonpDeserializer.numberDeserializer(), "_version");

	}

}
