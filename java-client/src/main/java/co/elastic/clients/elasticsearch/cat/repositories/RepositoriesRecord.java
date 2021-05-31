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

package co.elastic.clients.elasticsearch.cat.repositories;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: cat.repositories.RepositoriesRecord
public final class RepositoriesRecord implements ToJsonp {
	@Nullable
	private final String id;

	@Nullable
	private final String type;

	// ---------------------------------------------------------------------------------------------

	protected RepositoriesRecord(Builder builder) {

		this.id = builder.id;
		this.type = builder.type;

	}

	/**
	 * unique repository id
	 *
	 * API name: {@code id}
	 */
	@Nullable
	public String id() {
		return this.id;
	}

	/**
	 * repository type
	 *
	 * API name: {@code type}
	 */
	@Nullable
	public String type() {
		return this.type;
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

		if (this.id != null) {

			generator.writeKey("id");
			generator.write(this.id);

		}
		if (this.type != null) {

			generator.writeKey("type");
			generator.write(this.type);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RepositoriesRecord}.
	 */
	public static class Builder implements ObjectBuilder<RepositoriesRecord> {
		@Nullable
		private String id;

		@Nullable
		private String type;

		/**
		 * unique repository id
		 *
		 * API name: {@code id}
		 */
		public Builder id(@Nullable String value) {
			this.id = value;
			return this;
		}

		/**
		 * repository type
		 *
		 * API name: {@code type}
		 */
		public Builder type(@Nullable String value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link RepositoriesRecord}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RepositoriesRecord build() {

			return new RepositoriesRecord(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for RepositoriesRecord
	 */
	public static final JsonpValueParser<RepositoriesRecord> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, RepositoriesRecord::setupRepositoriesRecordParser);

	protected static void setupRepositoriesRecordParser(DelegatingJsonpValueParser<RepositoriesRecord.Builder> op) {

		op.add(Builder::id, JsonpValueParser.stringParser(), "id", "repoId");
		op.add(Builder::type, JsonpValueParser.stringParser(), "type", "t");

	}

}
