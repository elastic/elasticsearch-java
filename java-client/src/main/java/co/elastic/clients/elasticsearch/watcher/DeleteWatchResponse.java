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

// typedef: watcher.delete_watch.Response
public final class DeleteWatchResponse implements ToJsonp {
	private final Boolean found;

	private final String _id;

	private final Number _version;

	// ---------------------------------------------------------------------------------------------

	protected DeleteWatchResponse(Builder builder) {

		this.found = Objects.requireNonNull(builder.found, "found");
		this._id = Objects.requireNonNull(builder._id, "_id");
		this._version = Objects.requireNonNull(builder._version, "_version");

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

		generator.writeKey("found");
		generator.write(this.found);

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_version");
		generator.write(this._version.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DeleteWatchResponse}.
	 */
	public static class Builder implements ObjectBuilder<DeleteWatchResponse> {
		private Boolean found;

		private String _id;

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
		 * API name: {@code _version}
		 */
		public Builder _version(Number value) {
			this._version = value;
			return this;
		}

		/**
		 * Builds a {@link DeleteWatchResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DeleteWatchResponse build() {

			return new DeleteWatchResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for DeleteWatchResponse
	 */
	public static final JsonpDeserializer<DeleteWatchResponse> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, DeleteWatchResponse::setupDeleteWatchResponseDeserializer);

	protected static void setupDeleteWatchResponseDeserializer(DelegatingDeserializer<DeleteWatchResponse.Builder> op) {

		op.add(Builder::found, JsonpDeserializer.booleanDeserializer(), "found");
		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_version, JsonpDeserializer.numberDeserializer(), "_version");

	}

}
