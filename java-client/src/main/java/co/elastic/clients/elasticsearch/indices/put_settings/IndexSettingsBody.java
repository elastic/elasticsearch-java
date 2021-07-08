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

package co.elastic.clients.elasticsearch.indices.put_settings;

import co.elastic.clients.elasticsearch.indices.IndexSettings;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.put_settings.IndexSettingsBody
public final class IndexSettingsBody extends IndexSettings {
	@Nullable
	private final IndexSettings settings;

	// ---------------------------------------------------------------------------------------------

	protected IndexSettingsBody(Builder builder) {
		super(builder);
		this.settings = builder.settings;

	}

	/**
	 * API name: {@code settings}
	 */
	@Nullable
	public IndexSettings settings() {
		return this.settings;
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {
		super.toJsonpInternal(generator, mapper);
		if (this.settings != null) {

			generator.writeKey("settings");
			this.settings.toJsonp(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsBody}.
	 */
	public static class Builder extends IndexSettings.AbstractBuilder<Builder>
			implements
				ObjectBuilder<IndexSettingsBody> {
		@Nullable
		private IndexSettings settings;

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(@Nullable IndexSettings value) {
			this.settings = value;
			return this;
		}

		/**
		 * API name: {@code settings}
		 */
		public Builder settings(Function<IndexSettings.Builder, ObjectBuilder<IndexSettings>> fn) {
			return this.settings(fn.apply(new IndexSettings.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsBody}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsBody build() {

			return new IndexSettingsBody(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for IndexSettingsBody
	 */
	public static final JsonpDeserializer<IndexSettingsBody> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, IndexSettingsBody::setupIndexSettingsBodyDeserializer);

	protected static void setupIndexSettingsBodyDeserializer(DelegatingDeserializer<IndexSettingsBody.Builder> op) {
		IndexSettings.setupIndexSettingsDeserializer(op);
		op.add(Builder::settings, IndexSettings.DESERIALIZER, "settings");

	}

}
