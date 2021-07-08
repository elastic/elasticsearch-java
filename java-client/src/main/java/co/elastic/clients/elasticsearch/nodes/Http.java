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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: nodes._types.Http
public final class Http implements ToJsonp {
	private final Number currentOpen;

	private final Number totalOpened;

	// ---------------------------------------------------------------------------------------------

	protected Http(Builder builder) {

		this.currentOpen = Objects.requireNonNull(builder.currentOpen, "current_open");
		this.totalOpened = Objects.requireNonNull(builder.totalOpened, "total_opened");

	}

	/**
	 * API name: {@code current_open}
	 */
	public Number currentOpen() {
		return this.currentOpen;
	}

	/**
	 * API name: {@code total_opened}
	 */
	public Number totalOpened() {
		return this.totalOpened;
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

		generator.writeKey("current_open");
		generator.write(this.currentOpen.doubleValue());

		generator.writeKey("total_opened");
		generator.write(this.totalOpened.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Http}.
	 */
	public static class Builder implements ObjectBuilder<Http> {
		private Number currentOpen;

		private Number totalOpened;

		/**
		 * API name: {@code current_open}
		 */
		public Builder currentOpen(Number value) {
			this.currentOpen = value;
			return this;
		}

		/**
		 * API name: {@code total_opened}
		 */
		public Builder totalOpened(Number value) {
			this.totalOpened = value;
			return this;
		}

		/**
		 * Builds a {@link Http}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Http build() {

			return new Http(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for Http
	 */
	public static final JsonpDeserializer<Http> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Http::setupHttpDeserializer);

	protected static void setupHttpDeserializer(DelegatingDeserializer<Http.Builder> op) {

		op.add(Builder::currentOpen, JsonpDeserializer.numberDeserializer(), "current_open");
		op.add(Builder::totalOpened, JsonpDeserializer.numberDeserializer(), "total_opened");

	}

}
