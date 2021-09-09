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

package co.elastic.clients.elasticsearch._types.query_dsl;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.lang.String;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.QueryBase
public abstract class QueryBase implements ToJsonp {
	@Nullable
	private final Number boost;

	@Nullable
	private final String queryName;

	// ---------------------------------------------------------------------------------------------

	protected QueryBase(AbstractBuilder<?> builder) {

		this.boost = builder.boost;
		this.queryName = builder.queryName;

	}

	/**
	 * API name: {@code boost}
	 */
	@Nullable
	public Number boost() {
		return this.boost;
	}

	/**
	 * API name: {@code _name}
	 */
	@Nullable
	public String queryName() {
		return this.queryName;
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

		if (this.boost != null) {

			generator.writeKey("boost");
			generator.write(this.boost.doubleValue());

		}
		if (this.queryName != null) {

			generator.writeKey("_name");
			generator.write(this.queryName);

		}

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		@Nullable
		private Number boost;

		@Nullable
		private String queryName;

		/**
		 * API name: {@code boost}
		 */
		public BuilderT boost(@Nullable Number value) {
			this.boost = value;
			return self();
		}

		/**
		 * API name: {@code _name}
		 */
		public BuilderT queryName(@Nullable String value) {
			this.queryName = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupQueryBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::boost, JsonpDeserializer.numberDeserializer(), "boost");
		op.add(AbstractBuilder::queryName, JsonpDeserializer.stringDeserializer(), "_name");

	}

}
