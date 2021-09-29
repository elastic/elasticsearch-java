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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: watcher._types.PagerDutyContext
@JsonpDeserializable
public final class PagerDutyContext implements JsonpSerializable {
	private final String href;

	private final String src;

	private final PagerDutyContextType type;

	// ---------------------------------------------------------------------------------------------

	public PagerDutyContext(Builder builder) {

		this.href = Objects.requireNonNull(builder.href, "href");
		this.src = Objects.requireNonNull(builder.src, "src");
		this.type = Objects.requireNonNull(builder.type, "type");

	}

	public PagerDutyContext(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code href}
	 */
	public String href() {
		return this.href;
	}

	/**
	 * API name: {@code src}
	 */
	public String src() {
		return this.src;
	}

	/**
	 * API name: {@code type}
	 */
	public PagerDutyContextType type() {
		return this.type;
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

		generator.writeKey("href");
		generator.write(this.href);

		generator.writeKey("src");
		generator.write(this.src);

		generator.writeKey("type");
		this.type.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PagerDutyContext}.
	 */
	public static class Builder implements ObjectBuilder<PagerDutyContext> {
		private String href;

		private String src;

		private PagerDutyContextType type;

		/**
		 * API name: {@code href}
		 */
		public Builder href(String value) {
			this.href = value;
			return this;
		}

		/**
		 * API name: {@code src}
		 */
		public Builder src(String value) {
			this.src = value;
			return this;
		}

		/**
		 * API name: {@code type}
		 */
		public Builder type(PagerDutyContextType value) {
			this.type = value;
			return this;
		}

		/**
		 * Builds a {@link PagerDutyContext}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PagerDutyContext build() {

			return new PagerDutyContext(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PagerDutyContext}
	 */
	public static final JsonpDeserializer<PagerDutyContext> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			PagerDutyContext::setupPagerDutyContextDeserializer, Builder::build);

	protected static void setupPagerDutyContextDeserializer(DelegatingDeserializer<PagerDutyContext.Builder> op) {

		op.add(Builder::href, JsonpDeserializer.stringDeserializer(), "href");
		op.add(Builder::src, JsonpDeserializer.stringDeserializer(), "src");
		op.add(Builder::type, PagerDutyContextType._DESERIALIZER, "type");

	}

}
