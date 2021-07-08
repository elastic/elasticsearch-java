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

package co.elastic.clients.elasticsearch._global.rank_eval;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: _global.rank_eval.UnratedDocument
public final class UnratedDocument implements ToJsonp {
	private final String _id;

	private final String _index;

	// ---------------------------------------------------------------------------------------------

	protected UnratedDocument(Builder builder) {

		this._id = Objects.requireNonNull(builder._id, "_id");
		this._index = Objects.requireNonNull(builder._index, "_index");

	}

	/**
	 * API name: {@code _id}
	 */
	public String _id() {
		return this._id;
	}

	/**
	 * API name: {@code _index}
	 */
	public String _index() {
		return this._index;
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

		generator.writeKey("_id");
		generator.write(this._id);

		generator.writeKey("_index");
		generator.write(this._index);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UnratedDocument}.
	 */
	public static class Builder implements ObjectBuilder<UnratedDocument> {
		private String _id;

		private String _index;

		/**
		 * API name: {@code _id}
		 */
		public Builder _id(String value) {
			this._id = value;
			return this;
		}

		/**
		 * API name: {@code _index}
		 */
		public Builder _index(String value) {
			this._index = value;
			return this;
		}

		/**
		 * Builds a {@link UnratedDocument}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UnratedDocument build() {

			return new UnratedDocument(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for UnratedDocument
	 */
	public static final JsonpDeserializer<UnratedDocument> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, UnratedDocument::setupUnratedDocumentDeserializer);

	protected static void setupUnratedDocumentDeserializer(DelegatingDeserializer<UnratedDocument.Builder> op) {

		op.add(Builder::_id, JsonpDeserializer.stringDeserializer(), "_id");
		op.add(Builder::_index, JsonpDeserializer.stringDeserializer(), "_index");

	}

}
