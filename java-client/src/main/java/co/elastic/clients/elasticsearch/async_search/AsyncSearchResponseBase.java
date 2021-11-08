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

package co.elastic.clients.elasticsearch.async_search;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: async_search._types.AsyncSearchResponseBase

public abstract class AsyncSearchResponseBase implements JsonpSerializable {
	@Nullable
	private final String id;

	private final boolean isPartial;

	private final boolean isRunning;

	private final String expirationTimeInMillis;

	private final String startTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected AsyncSearchResponseBase(AbstractBuilder<?> builder) {

		this.id = builder.id;
		this.isPartial = ModelTypeHelper.requireNonNull(builder.isPartial, this, "isPartial");
		this.isRunning = ModelTypeHelper.requireNonNull(builder.isRunning, this, "isRunning");
		this.expirationTimeInMillis = ModelTypeHelper.requireNonNull(builder.expirationTimeInMillis, this,
				"expirationTimeInMillis");
		this.startTimeInMillis = ModelTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis");

	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Required - API name: {@code is_partial}
	 */
	public final boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * Required - API name: {@code is_running}
	 */
	public final boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * Required - API name: {@code expiration_time_in_millis}
	 */
	public final String expirationTimeInMillis() {
		return this.expirationTimeInMillis;
	}

	/**
	 * Required - API name: {@code start_time_in_millis}
	 */
	public final String startTimeInMillis() {
		return this.startTimeInMillis;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		generator.writeKey("is_partial");
		generator.write(this.isPartial);

		generator.writeKey("is_running");
		generator.write(this.isRunning);

		generator.writeKey("expiration_time_in_millis");
		generator.write(this.expirationTimeInMillis);

		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				ObjectBuilderBase {
		@Nullable
		private String id;

		private Boolean isPartial;

		private Boolean isRunning;

		private String expirationTimeInMillis;

		private String startTimeInMillis;

		/**
		 * API name: {@code id}
		 */
		public final BuilderT id(@Nullable String value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - API name: {@code is_partial}
		 */
		public final BuilderT isPartial(boolean value) {
			this.isPartial = value;
			return self();
		}

		/**
		 * Required - API name: {@code is_running}
		 */
		public final BuilderT isRunning(boolean value) {
			this.isRunning = value;
			return self();
		}

		/**
		 * Required - API name: {@code expiration_time_in_millis}
		 */
		public final BuilderT expirationTimeInMillis(String value) {
			this.expirationTimeInMillis = value;
			return self();
		}

		/**
		 * Required - API name: {@code start_time_in_millis}
		 */
		public final BuilderT startTimeInMillis(String value) {
			this.startTimeInMillis = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupAsyncSearchResponseBaseDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(AbstractBuilder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(AbstractBuilder::expirationTimeInMillis, JsonpDeserializer.stringDeserializer(),
				"expiration_time_in_millis");
		op.add(AbstractBuilder::startTimeInMillis, JsonpDeserializer.stringDeserializer(), "start_time_in_millis");

	}

}
